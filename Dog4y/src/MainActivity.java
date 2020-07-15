
import Controller.LoginController;
import DataBase.ClientRepository;

import View.Login;




public class MainActivity {

	public static void main(String[] args) throws Exception {
	
		try{
			Login view = new Login();
			
			ClientRepository model = new ClientRepository();
					
			LoginController logController = new LoginController(view,model);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
