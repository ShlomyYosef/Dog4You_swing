	package DataBase;

	import java.io.IOException;
	import java.util.Set;
	import model.Client;

	
public interface ClientRepositoryInterface {

		void add(Client user) throws Exception;

		void delete(String userName) throws IOException;

		Set<Client> findAll();

		Client findByName(String name);

		boolean isExist(String userName);
		
		boolean check_login(String userName,char[] password);

		boolean isValidName(String str);
		
		Client findByEmail (String email);
		
		boolean isUserNameExist(String userName);
		
		boolean isEmailExist(String email);
		
		boolean isValidEmail(String email);
		
		boolean isValidPhone (String number);
}
