package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.UserRepository;
import View.SignUpUI;

public class SignUpController {

	private UserRepository theModel;
	private SignUpUI theView;
	
	public  SignUpController(SignUpUI theView,UserRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
		
		theView.addSignUpListener(new SignUpListener());
		
	}
	
	
	class SignUpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			 String userName;
			
		}
		
	}
	
	
	
}
