package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.ClientRepository;
import DataBase.DogRepository;
import View.KennelUI;
import View.Login;

public class KennelController {

	
	
	private KennelUI theView;
	private DogRepository theModel;
	private String kennelUserName;
	
	public KennelController(KennelUI theView,DogRepository theModel,String userName) {
		
		this.theModel = theModel;
		this.theView = theView;
		this.kennelUserName=userName;
	this.theView.setVisible(true);	
	
	theView.addGoBackListener(new GoBackListener());
	
	theView.addAddDogListener(new AddDogListener());
	
	theView.addRemoveDogListener(new RemoveDogListener());

	}
	
	
	
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
		
	class AddDogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String dogName=null;
			String	breed = null;
			String character=null;
			String finalSize=null;
			String location=null;
			String age=null;	
			try {
				dogName =theView.getDogName();
				breed = theView.getBreed();
				character = theView.getPersonality();
				finalSize = theView.getDogFinalSize();
				location = theView.getDogLocation();
				age = theView.getAge();
				
				if(dogName.equals("")) {
					
				}
				
			
				
				
			}catch(Exception error) {
					 theView.displayErrorMessage("Ops ! Something went wrong");
				 }
		//	if(dogName.equals("")||)
			
			
			
		}
		
	}
	
	class RemoveDogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
		}
		
		
		
	}
}
