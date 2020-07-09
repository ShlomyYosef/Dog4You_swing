package Controller;

import DataBase.DogRepository;
import View.UserUI;

public class UserController {
	private UserUI theView;
	private DogRepository theModel;
	
	
	
	public UserController(UserUI theView,DogRepository theModel,String userName) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		theView.displayPage(userName);		
	}
	
	
	
}
