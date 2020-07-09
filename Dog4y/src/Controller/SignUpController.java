package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.UserRepository;
import View.SignUpUI;
import model.User;

public class SignUpController {

	private UserRepository theModel;
	private SignUpUI theView;
	
	public  SignUpController(SignUpUI theView,UserRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
		theView.displayPage();
		theView.addSignUpListener(new SignUpListener());
		
	}
	
	//SignUpListener class handle the button press
	class SignUpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			 String userName=null,
					firstName=null,
					lastName=null,
					email=null,
					address=null,
					phoneNumber=null,
					permissions=null;
			 char[] password;
			 try {
			 //get all text from the view 
			 userName = theView.getUserName();	 
			 firstName= theView.getFirstName(); 
			 lastName= theView.getLastName();
			 email= theView.getEmail();
			 address= theView.getAddress();
			 phoneNumber= theView.getPhone();
			 password= theView.getPassword();
			 permissions= theView.getPermissons();
			 
			 //************
			 //needs to check why empty textbox dont get inside the if state!
			 //************
			 if(lastName.equals("")||password.equals("")||phoneNumber.equals("")||address.equals("")||email.equals("")||userName.equals("")||firstName.equals("")) { 
				 theView.displayErrorMessage("Please make sure to fill all details!");
			 }
			 else {
				 
				 // adding user .
				 if(!theModel.isExist(userName)) {
					theModel.add(new User(email,userName,new String(password)));
				 }
				 else // user already exists 
				 theView.displayErrorMessage("This user name is taken!");
			 }
			 
			 
			 
			 
			 }
			 catch(Exception error) {
				 theView.displayErrorMessage("Ops ! Something went wrong");
			 }
		}
		
	}
	
	
	
}
