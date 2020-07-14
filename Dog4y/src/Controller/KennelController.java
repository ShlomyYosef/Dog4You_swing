package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.KennelUI;
import View.Login;
import model.Dog;

public class KennelController {

	
	
	private KennelUI theView;
	private DogRepository theModel;
	private String kennelUserName;
	
	public KennelController(KennelUI theView,DogRepository theModel,String userName) {
		
		this.theModel = theModel;
		this.theView = theView;
		this.kennelUserName=userName;
		
	this.theView.setVisible(true);	
	
	theView.addGoBackListener(new GoBackListener());
	
	theView.addAddDogListener(new AddDogListener());
	
	theView.addRemoveDogListener(new RemoveDogListener());

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
				
				
				
				if(!dogName.equals("")||!breed.equals("")||!character.equals("")||!finalSize.equals("")||!location.equals("")||!age.equals("")) {
					theModel.add(new Dog(dogName,breed,character,finalSize,location,age,kennelUserName,gender,vaccine.equals("Yes"),furtille.equals("Yes"),tamed.equals("Yes")));		
					theView.clearText();
					theView.displayMessage("Dog had been added!");		
				}
				else {
					theView.displayErrorMessage("Please make sure to fill all fields!");	
				}
									
		}catch(Exception error) {
				theView.displayErrorMessage("Please make sure to fill all fields!");
				 }	
		}
		
	}
	
	class RemoveDogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			
		}
		
		
		
	}
}
