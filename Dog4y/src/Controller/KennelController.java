package Controller;

import DataBase.DogRepository;
import View.KennelUI;

public class KennelController {

	
	
	private KennelUI theView;
	private DogRepository theModel;
	
	public KennelController(KennelUI theView,DogRepository theModel) {
		
		this.theModel = theModel;
		this.theView = theView;
		
	this.theView.setVisible(true);	
	}
}
