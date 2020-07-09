
import Controller.LoginController;
import DataBase.ClientRepository;

import View.Login;




public class MainActivity {

	public static void main(String[] args) throws Exception {
	
		try{
			Login log = new Login();
			
			ClientRepository model = new ClientRepository();
					
			LoginController logController = new LoginController(log,model);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
