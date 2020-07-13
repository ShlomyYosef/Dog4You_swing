package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	
	
	public UserController(UserUI theView,DogRepository theModel,String userName) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		theView.displayPage(userName);		
		
		theView.addGoBackListener(new GoBackListener());
		
		theView.addSearchListener(new SearchListener());
		
		theView.addAdvancedListener(new AdvancedListener());
		
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
			 vaccine,furtille,trained;
			Set<Dog> result;
			
			try {
			breed = theView.getBreed();
			character=theView.getPersonality();
			location=theView.getDogLocation();
			age=theView.getAge();
			vaccine=theView.getVaccine();
			furtille=theView.getFurtille();
			trained=theView.getTrained();
			//clear last result .
			theView.clearList();
			
			if(advancedOptionFlag) { // use advanced search. 
				if(breed.equals("")&&character.equals("")&&location.equals("")&&age.equals("")&&vaccine.equals("")&&furtille.equals("")&&trained.equals("")) {
					theView.displayErrorMessage("Make sure to fill and search fields!");
				}else {
					
				result = theModel.findAdvanced(breed, age, location, character, vaccine.equals("Yes"), trained.equals("Yes"), furtille.equals("Yes"));
				if(result!=null) {
				for(Dog dog:result) {
					theView.setListElement(dog.toString());
				}
				theView.setListResult();
				}
				theView.displayErrorMessage("Dog not found!");
				}		
			}	
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
