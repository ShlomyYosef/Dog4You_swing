package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import Controller.UserController.MouseClick;
import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.KennelUI;
import View.Login;
import model.Dog;
import model.Helper;

public class KennelController {

	
	
	private KennelUI theView;
	private DogRepository theModel;
	private String kennelUserName;
	private boolean isDisplay= false;
	private String phone;
	private Helper help;
	
	public KennelController(KennelUI theView,DogRepository theModel,String userName,String phone) {
		
		this.theModel = theModel;
		this.theView = theView;
		this.kennelUserName=userName;
		this.phone = phone;
		loadAllDogs(kennelUserName); // loads all the dogs that this kennel added
		help = new Helper();
	this.theView.setVisible(true);	
	
	theView.addGoBackListener(new GoBackListener());
	
	theView.addAddDogListener(new AddDogListener());
	
	theView.addRemoveDogListener(new RemoveDogListener());

	theView.addEditDogListener(new EditDogListener());
	
	theView.AddMouseListener(new MouseClick());
	
	}
	
	
	
	class GoBackListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					
				Login log = new Login();
				
				ClientRepository model = new ClientRepository();
				
				
				LoginController logController = new LoginController(log,model);		
				
				theView.exitPage();
				}
				 catch(Exception error) {
					 theView.displayErrorMessage("Ops ! Something went wrong");
				 }
			}	
	}
	
	//handles the edit button
	class EditDogListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		if(theView.getListElementSize()>0) //check if list is empty
			try {
				Dog dog;
				try {
				dog = theView.getSelectedItem();
				if(dog==null) {
					theView.displayErrorMessage("Make Sure to chose a dog!");	
					return;
				}
				}
				catch(Exception error) {
				theView.displayErrorMessage("Make Sure to chose a dog!");	
				return;
			}	
				theView.displayMessage("Make sure to add the dog after edit,\nOR else the dog will get deleted!");
				theView.setDetailsForEdit(dog); // setting all the dog details in the text fields 
				theModel.delete(dog);
				int index = theView.getSelectedIndex(); //get selected index
				theView.removeItemFromList(index); // delete the selected value 
			}catch(Exception error) {
				theView.displayErrorMessage("Ops! something went wrong!");
				
			}	
			
		}
		
	}
	
	class AddDogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String dogName=null;
			String	breed = null;
			String character=null;
			String finalSize=null;
			String location=null;
			String age=null;
		
			String vaccine=null;
			String furtille=null;
			String tamed=null;
			String gender=null;
			try {
				dogName =theView.getDogName();
				breed = theView.getBreed();
				character = theView.getPersonality();
				finalSize = theView.getDogFinalSize();
				location = theView.getDogLocation();
				age = theView.getAge();
				gender = theView.getDogGender();
				vaccine =theView.getVaccine();
				furtille = theView.getFurtille();
				tamed = theView.getTrained();
				
				if(!help.isValidName(dogName)) {
					 theView.displayErrorMessage("Dog name cant contain numbers!");
					 return;
				}
					
				if(!dogName.equals("")||!breed.equals("")||!character.equals("")||!finalSize.equals("")||!location.equals("")||!age.equals("")) {
					Dog temp = new Dog(dogName,breed,character,finalSize,location,age,kennelUserName,phone,gender,vaccine.equals("Yes"),furtille.equals("Yes"),tamed.equals("Yes"));
					theModel.add(temp);	//add dog to db
					theView.addItemElementToList(temp);// add new dog to list
					theView.clearText();
					theView.displayMessage("Dog had been added!");		
					isDisplay=true;
				}
				else {
					theView.displayErrorMessage("Please make sure to fill all fields!");	
				}
									
		}catch(Exception error) {
				theView.displayErrorMessage("Please make sure to fill all fields!");
				 }	
		}
		
	}
	
	class MouseClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			try {
			if(isDisplay)
			if(arg0.getClickCount()==2) {
				Dog dog = theView.getSelectedItem();
				
				theView.displayMessage("Dog Information:\n\n\n"
				+"Name:  "+dog.getName()
				+"\n\n"+"Breed:  "+dog.getBreed()
				+"\n\n"+"Character:  "+dog.getCharacter()
				+"\n\n"+"Final size:  "+dog.getFinalSize()
				+"\n\n"+"Location:  "+dog.getLocation()
				+"\n\n"+"Age:  "+dog.getDogAge()
				+"\n\n"+"Gender:  "+dog.getGender()
				+"\n\n"+"Vaccsine:  "+dog.isVaccsine()
				+"\n\n"+"Furtille:  "+dog.isFurtille()
				+"\n\n"+"Tamed:  "+dog.isTamed()
				+"\n\n"+"Contact us:  "+dog.getKennelPhone()+"\n");
			}
			}
			catch(Exception er) {
				
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class RemoveDogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(theView.getListElementSize()>0) //check if list is empty
			try {
				Dog dog;
				try {
				dog = theView.getSelectedItem();
				if(dog==null) {
				theView.displayErrorMessage("Make Sure to chose a dog!");	
				return;
				}
				}
				catch(Exception error) {
				theView.displayErrorMessage("Make Sure to chose a dog!");	
				return;
			}	
				theModel.delete(dog);
				int index = theView.getSelectedIndex();
				theView.removeItemFromList(index);
			
				
			}catch(Exception error) {
				theView.displayErrorMessage("Ops! something went wrong!");	
			}	
		}
		
		
		
	}

	public void loadAllDogs(String userName) {
	Set<Dog> results;
	
	results=theModel.findByKennel(userName);
	if(!results.isEmpty()) {
		isDisplay=true;
		for(Dog dog:results) {
			if(userName.equals(dog.getKennelUserName())) {
				theView.addItemElementToList(dog);
			}
		}		
	}
	theView.setListResult();
	return;
}

}

