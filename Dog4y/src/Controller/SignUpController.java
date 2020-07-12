package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DataBase.ClientRepository;
import View.Login;
import View.SignUpUI;
import model.Client;
import model.User;

public class SignUpController {

	private ClientRepository theModel;
	private SignUpUI theView;
	
	public  SignUpController(SignUpUI theView,ClientRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
		theView.displayPage();
		theView.addSignUpListener(new SignUpListener());
		theView.addGoBackListener(new GoBackListener());
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
			 else if (model.User.isNotOnlyLetters(firstName)||model.User.isNotOnlyLetters(lastName)){
				 theView.displayErrorMessage("Error! name must contain only letters!");
				 }
			 else if (!model.User.isValidEmail(email)) {
				 theView.displayErrorMessage("Error! Invalid Email!");
			 }
			 else if (!model.User.isValidPhone(phoneNumber)) {
				 theView.displayErrorMessage("Error! Invalid phone number!");
			 }
			 
			 else {
				 
				 // adding user and go back to login screen.
				 if(!theModel.isExist(userName)) {
					theModel.add(new Client(email,userName,new String(password),firstName,lastName,address,phoneNumber,permissions));
					
					Login log = new Login();
					
					ClientRepository model = new ClientRepository();
					
					
					LoginController logController = new LoginController(log,model);		
					theView.displayErrorMessage("user created successfully");
					theView.exitPage();
				 }
				 else {// user already exists 
				 theView.displayErrorMessage("This user name is taken!");
				 theView.setFocusUserName();
			 }
			 }
			 
			 
			 
			 
			 }
			 catch(Exception error) {
				 theView.displayErrorMessage("Ops ! Something went wrong");
			 }
		}
		
	}
	// go back button listener
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
	
}
