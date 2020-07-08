
import Controller.LoginController;
import DataBase.UserRepository;
import View.Login;




public class MainActivity {

	public static void main(String[] args) throws Exception {
	
		try{
//			while (true) {
//				System.out.println("Welcome!");
//			System.out.println("1. Add new user");
//			System.out.println("2. Print all users");
//			System.out.println("Q. Exit");
//			String selectedOption = scanner.nextLine();
//			switch (selectedOption) {
//			case "1":
//				System.out.print("Write your id (number): ");
//				String id = scanner.nextLine();
//				System.out.print("Write your name: ");
//				String name = scanner.nextLine();
//				System.out.print("Write your password: ");
//				String password= scanner.nextLine();
//				try {
//				userRepository.add(new User(id, name, password));
//				}
//					catch(Exception ex) {
//						System.out.print(ex);
//						
//					}
//					
//					break;
//				case "2":
//				Set<User> users = userRepository.findAll();
//					for (User user : users) {
//						System.out.println(user);
//				}
//					break;	
//				
//			case "3":  
//				System.out.print("User to delete : ");
//				String del = scanner.nextLine();
//					userRepository.delete(del);
//					break;
//				case "Q":
//				case "q":
//				default:
//					System.out.println("Goodbye");
//					System.exit(0);
//			
//				}
//			}
			
			Login log = new Login();
			
			UserRepository model = new UserRepository();
			
			
			LoginController logController = new LoginController(log,model);
			
			log.setVisible(true);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
