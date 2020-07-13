package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Controller.SignUpController.GoBackListener;
import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.Login;
import View.UserUI;

public class UserController {
	private UserUI theView;
	private DogRepository theModel;
	
	
	
	public UserController(UserUI theView,DogRepository theModel,String userName) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		theView.displayPage(userName);		
		
		theView.addGoBackListener(new GoBackListener());
		
		theView.addSearchListener(new SearchListener());
		
		theView.addAdvancedListener(new AdvancedListener());
		
	}
	
	//goback to login screen 
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
			 vaccsine,furtille,trained;
			
			try {
			breed = theView.getBreed();
			character=theView.getPersonality();
			location=theView.getDogLocation();
			age=theView.getAge();
			vaccsine=theView.getVaccine();
			furtille=theView.getFurtille();
			trained=theView.getTrained();
			
			
			
			// check 
			System.out.println(breed);
			System.out.println(character);
			System.out.println(location);
			System.out.println(age);
			System.out.println(vaccsine);
			System.out.println(furtille);
			System.out.println(trained);
			
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
        	boolean flag = false;
         if(e.getStateChange()==1) 
        	 flag = true;	
		
         theView.setAdvancedVisible(flag);
		}
	}
}
