package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.AdminUI;
import View.Login;
import View.SignUpUI;
import model.Client;



public class AdminController {

	private ClientRepository theModel;
	private AdminUI theView;
	
	public AdminController(AdminUI view,ClientRepository model){
		
		this.theView = view;
		this.theModel = model;
		
		this.showAllUsers();
		
		theView.displayPage();
		
		theView.addGoBackListener(new GoBackListener());
		
		theView.addClientListener(new AddClientListener());
		
		theView.addDeleteListener(new DeleteClientListener());
	}
	
	class DeleteClientListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Client user = theView.getSelectedItem();
				if(user.getPermission().equals("Kennel")) {
					DogRepository dogDB = new DogRepository();
					dogDB.deleteAllDogsKennel(user.getUserName());
				}
				
				theModel.delete(user.getUserName());
				int index = theView.getSelectedIndex();
				theView.removeItemFromList(index);	
			}catch(Exception error) {
				theView.displayErrorMessage("Ops! something went wrong!");	
			}
			
		}			
	}
	
	//log out to main menu
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
	
	class AddClientListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				
				SignUpUI view = new SignUpUI();
				
				ClientRepository model = new ClientRepository(); 
				
				SignUpController controller = new SignUpController(view,model,true);
				
				theView.exitPage();
			}
			// needs to put a proper message .
			catch(Exception error) {
				
				theView.displayErrorMessage("Ops ! Something went wrong");
			}
					
			}			
		
	}
	
	
	public void showAllUsers() {
		Set<Client> results;
		
		results=theModel.findAll();
		if(!results.isEmpty()) {
			for(Client user :results) {
					theView.addClientToListElement(user);	
			}
			theView.setListResult();
		}
		return;
	}
	
}
