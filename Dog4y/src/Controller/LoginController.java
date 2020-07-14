package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.ClientRepository;
import DataBase.DogRepository;
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
	
	this.theView.addSignUpListener(new SignUpListener());
	}
	
	//login listener class handle the button press
	class LoginListener implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
		String userName;
		char[] password;
		try {
			
		userName = theView.getUserName();
		password = theView.getPassword();
		
		// if true go to new screen 
		if(theModel.check_login(userName, password)) {
			
			theView.displaySuccessMessage("Login was successful!");
			
			UserUI view = new UserUI();
			
			DogRepository dog = new DogRepository(); 
			
			UserController controller = new UserController(view,dog,userName);
			
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

	
}
