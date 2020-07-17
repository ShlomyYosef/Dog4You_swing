package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import Controller.SignUpController.GoBackListener;
import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.Login;
import View.UserUI;
import model.Dog;

public class UserController {
	private UserUI theView;
	private DogRepository theModel;
	private boolean advancedOptionFlag=false;
	private boolean isDisplay =false;
	
	
	public UserController(UserUI theView,DogRepository theModel,String userName) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		theView.displayPage(userName);		
		
		theView.addGoBackListener(new GoBackListener());
		
		theView.addSearchListener(new SearchListener());
		
		theView.addAdvancedListener(new AdvancedListener());
		
		theView.AddMouseListener(new MouseClick());
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
				+"\n\n"+"Contact us:  "+dog.getKennelPhone()
				+"\n");
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
	//go back to login screen 
	class GoBackListener implements ActionListener {
	
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
	
	// search dogs in the data base 
	class SearchListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			String 
			 breed,character,location,age,
			 vaccine,furtille,trained,gender;
			Set<Dog> result;
			
			try {
			breed = theView.getBreed();
			location=theView.getDogLocation();
			age=theView.getAge();
			gender=theView.getGender();
			
			//clear last result .
			theView.clearList();
			
			if(advancedOptionFlag) { // use advanced search. 
				try {
				vaccine=theView.getVaccine();
				furtille=theView.getFurtille();
				trained=theView.getTrained();
				character=theView.getPersonality();
				}catch(Exception errr) {
					theView.displayErrorMessage("Please make sure to fill all fields!");
					return;
				}

				if(breed.equals("")||character.equals("")||location.equals("")||age.equals("")||vaccine.equals("")||furtille.equals("")||trained.equals("")||gender.equals("")) {
					theView.displayErrorMessage("Make sure to fill and search fields!");
				}else {
					
				result = theModel.findAdvanced(breed, age, location, character, vaccine.equals("Yes"), trained.equals("Yes"), furtille.equals("Yes"));
				if(!result.isEmpty()) {
					isDisplay=true;
				for(Dog dog:result) {
					theView.setListElement(dog); // check if use dog or dog.toString() method
				}
				theView.setListResult();
				}
				else {
				theView.displayErrorMessage("Dog not found!");
				}
				}		
			}
			else {  // not advanced search
				if(breed.equals("")||age.equals("")||location.equals("")) {
					theView.displayErrorMessage("Please make sure to chose breed, age and location!");
				}
				else {
					result=theModel.findDogByBreedAgeLocation(breed, age, location);
					if(!result.isEmpty()) {
						isDisplay=true;
						for(Dog dog:result) {
							theView.setListElement(dog); // check if use dog or dog.toString() method
						}
						theView.setListResult();
						}
					else {
						theView.displayErrorMessage("Dog Not found!");
						
					}
				}	
			}
			theView.clearText();
			}
			catch(Exception err) {
				theView.displayErrorMessage("Ops! somthing went wrong!");
			}
			
		}
		
		
		
	}
	
	// show advanced option when pressed 
	class AdvancedListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			advancedOptionFlag = false;
         if(e.getStateChange()==1) 
        	 advancedOptionFlag = true;	
		
         theView.setAdvancedVisible(advancedOptionFlag);
		}
	}
	
	
}
