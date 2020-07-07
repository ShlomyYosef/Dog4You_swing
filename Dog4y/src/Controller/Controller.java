package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.UserRepository;
import View.Login;

public class Controller {
	
	private Login theView;
	private UserRepository theModel;
	
	public Controller(Login theView,UserRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
		
	this.theView.addLoginListener(new LoginListener());
	}
	
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
	
	
}
