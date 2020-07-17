package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.AdminUI;
import View.ContactUs;
import View.KennelUI;
import View.Login;
import View.SignUpUI;
import View.UserUI;

public class LoginController {
	
	private Login theView;
	private ClientRepository theModel;
	
	public LoginController(Login theView,ClientRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
	this.theView.setVisible(true);	
	
	// listener for login button
	this.theView.addLoginListener(new LoginListener());
	// listener for login as guest button
	this.theView.addGuestListener(new GuestListener());
	// listener for signup button
	this.theView.addSignUpListener(new SignUpListener());
	// listener for contact us button
	this.theView.addContactUsListener(new ContactUsListener());

	}
	
	//login listener class handle the button press
	class LoginListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
		String userName ,permission;
		String phone;
		char[] password;
		try {
			
		userName = theView.getUserName();
		password = theView.getPassword();
		
		// if true go to new screen 
		if(theModel.check_login(userName, password)) {
			permission = theModel.getClientPremission(userName); //get the client permisson
			
			theView.displaySuccessMessage("Login was successful!");
			
			if(permission.equals("User")) { // if user so open the user UI
			UserUI view = new UserUI();
			
			DogRepository model = new DogRepository(); 
			
			UserController controller = new UserController(view,model,userName);
			}
			else if(permission.equals("Kennel")) { //if kennel the open kennel ui
				phone = theModel.getUserNamePhoneNumber(userName);
				KennelUI view = new KennelUI();
				
				DogRepository model = new DogRepository(); 
				
				KennelController controller = new KennelController(view,model,userName,phone);
			}
			else if(permission.equals("Admin")) {//if admin open admin UI
				AdminUI view = new AdminUI();
				
				ClientRepository model = new ClientRepository(); 
				
				AdminController controller = new AdminController(view,model);
				
			//	AdminController controller = new AdminController(view,model);    // need to build
			}		
			theView.exitPage();
		}
		else {
			// put out an error msg 
			theView.displayErrorMessage("Please check your username or password is currect");
		}
		
		}
		// needs to put a proper message .
		catch(Exception error) {
			
			theView.displayErrorMessage("Ops ! Something went wrong");
		}
			
			
		}		
	}
	//guest listener class handle the button press
	class GuestListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
		try {
				
			theView.displaySuccessMessage("Hello Guest!");
			
			UserUI view = new UserUI();
			
			DogRepository dog = new DogRepository(); 
			
			UserController controller = new UserController(view,dog,null);
			
			theView.exitPage();

		}
		// needs to put a proper message .
		catch(Exception error) {
			
			theView.displayErrorMessage("Ops ! Something went wrong");
		}
				
		}
		
	}

	//signUp listener class handle the button press
	class SignUpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
							
				SignUpUI view = new SignUpUI();
				
				ClientRepository dog = new ClientRepository(); 
				
				SignUpController controller = new SignUpController(view,dog);
				
				theView.exitPage();
			}
			// needs to put a proper message .
			catch(Exception error) {
				
				theView.displayErrorMessage("Ops ! Something went wrong");
			}
					
			}			
				
	}
	
	//go to contact us page
	class ContactUsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
							
				ContactUs view = new ContactUs();
				
				ContactUSController  controller =new ContactUSController(view);
				
				theView.exitPage();
			}
			// needs to put a proper message .
			catch(Exception error) {
				
				theView.displayErrorMessage("Ops ! Something went wrong");
			}
					
			}			
	
	
	}
}
