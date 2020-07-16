package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DataBase.ClientRepository;
import View.ContactUs;
import View.Login;


public class ContactUSController {
	
	
	private ContactUs theView;
	
	
public ContactUSController(ContactUs theView){
		
		this.theView = theView;
		
		
		theView.displayPage();		
		theView.addGoBackListener(new contactUsListener());
	}
class contactUsListener implements ActionListener{

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
