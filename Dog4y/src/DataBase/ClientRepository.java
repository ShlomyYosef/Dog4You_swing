package DataBase;

import java.io.IOException;
import java.util.Set;
import java.util.regex.Pattern;

import model.Client;


public class ClientRepository implements ClientRepositoryInterface{
	
	private String FILENAME;
	private Set<Client> users;
	private FileManager<Client> fileManager;
	//clients db
	public ClientRepository() throws IOException, ClassNotFoundException {
		
		this.FILENAME= "clients";
		this.fileManager = new FileManager<Client>(FILENAME);
		this.users = this.fileManager.read();
		createAdmin();
	}
	// test file this way the main DB not effected 
	public ClientRepository(String fileName) throws IOException, ClassNotFoundException {
		this.FILENAME=fileName;
		this.fileManager = new FileManager<Client>(fileName);
		this.users = this.fileManager.read();
		createAdmin();
	}
	
	// adding user 
	@Override
	public void add(Client user) throws Exception {
	
		if (user == null) {
			throw new Exception("must have a value");
		}
		
		if (isExist(user.getUserName())) {
			throw new Exception("UserName already exist ! ");
		}
		this.users.add(user);
		this.fileManager.write(this.users);
	}

	@Override
	public void delete(String userName) throws IOException {	
		this.users.remove(findByName(userName));
		this.fileManager.write(this.users);
	}

	//return all users in file 
	@Override
	public Set<Client> findAll() {
		
		return this.users;
	}
//find user by username 
	@Override
	public Client findByName(String name) {
		for (Client user : users) {
			if (name.equals(user.getUserName())) {
				return user;
			}
		}
		return null;
	}
	//get the user premissions
	public String getClientPremission(String name) {
		Client temp;
		temp = this.findByName(name);
		
		return temp.getPermission();
	}
//check if user name is taken
	@Override
	public boolean isExist(String userName) {
		if(findByName(userName)==null)
			return false;
		else 
			return true;
	}
	//get the user phonenumber
	public String getUserNamePhoneNumber (String name) {
		Client temp;
		temp =this.findByName(name);
		
		if(temp!=null)
		return temp.getPhoneNumber();
		else
			return null;
	}
	
	// check login for user compare the name and password of user .
	public boolean check_login(String userName,char[] password) {
		Client user;
		
		user = this.findByName(userName);
		// if user not in the DB 
		if(user==null)
			return false;
		// if user in DB then compare password if all good return true 
		if(user.getPassword().equals(new String(password)))
		return true;
		
	//	System.out.print(user.getPassword());
	//System.out.print(password);
		
		return false;
	}
	//find by email 
	@Override
	public Client findByEmail (String email) {
		for (Client user : users) {
			if (email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}
//check if valid email 
	@Override
	public boolean isEmailExist(String email) {
		if(findByEmail(email)==null)
			return false;
		return true;
	}

	public Set<Client> getUsers() {
		return users;
	}

	private void createAdmin() {
		if(users.size()==0) {		
			try {
			users.add(new Client("Dog4you@gmail.com","Admin","Admin","Admin","","","","Admin"));
			}
			catch(Exception error) {
				System.out.println("Error! something went wrong while creating admin");
			}
		}
	}
}
