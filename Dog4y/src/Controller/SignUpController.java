package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DataBase.ClientRepository;
import View.AdminUI;
import View.Login;
import View.SignUpUI;
import model.Client;
import model.Helper;


public class SignUpController {

	private ClientRepository theModel;
	private SignUpUI theView;
	private boolean permisson=false;
	private Helper help;
	
	public  SignUpController(SignUpUI theView,ClientRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		theView.displayPage();
		theView.addSignUpListener(new SignUpListener());
		theView.addGoBackListener(new GoBackListener());
		this.help = new Helper();
	}
	//handles the admin signing up users and return it to admin page 
	public SignUpController(SignUpUI theView,ClientRepository theModel,boolean permisson) {
		
		this.theModel = theModel;
		this.theView = theView;
		
		theView.displayPage();
		theView.addSignUpListener(new SignUpListener());
		theView.addGoBackListener(new GoBackListener());
		
		this.permisson=permisson;
		this.help = new Helper();	
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
			 //check valid phone
			 if(!help.isValidPhone(phoneNumber)) {
				 theView.displayErrorMessage("Please enter valid phone number");
				 return;
			 }
			 //check valid email
			 if(!help.isValidEmail(email)) {
				 theView.displayErrorMessage("Please enter valid email");
				 return;
			 }
			 //check valid last and first name 
			 if(!help.isValidName(firstName)||!help.isValidName(lastName)) {
				 theView.displayErrorMessage("First/Last name cant contain numbers!");
				 return;
			 }

			 //check if fields are empty
			 if(lastName.equals("")||password.equals("")||phoneNumber.equals("")||address.equals("")||email.equals("")||userName.equals("")||firstName.equals("")) { 
				 theView.displayErrorMessage("Please make sure to fill all details!");
				 return;
			 }
			 else {
				 
				 //check if email valid
				 if(theModel.isEmailExist(email)) {
					 theView.displayErrorMessage("This email is taken!");
					 return;
				 }	 
				 // adding user and go back to login screen.
				 if(!theModel.isExist(userName)) {
					 //adding new client
					theModel.add(new Client(email,userName,new String(password),firstName,lastName,address,phoneNumber,permissions));
					if(permisson) { // if admin adds go back to admin ui
						AdminUI view = new AdminUI();
						
						ClientRepository model = new ClientRepository(); 
						
						AdminController controller = new AdminController(view,model);
					}else { // else go back to login screen
					Login log = new Login();
					
					ClientRepository model = new ClientRepository();
					
					
					LoginController logController = new LoginController(log,model);		
					}
					theView.exitPage();
				 }
				 else // user already exists 
				 theView.displayErrorMessage("This user name or email is taken!");
				 theView.setFocusUserName();
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
