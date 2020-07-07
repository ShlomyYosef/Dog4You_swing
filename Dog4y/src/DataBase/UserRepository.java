package DataBase;

import java.io.IOException;
import java.util.Set;
import model.User;

public class UserRepository implements UserRepoInterface {

	private final String FILENAME = "users";
	private Set<User> users;
	private FileManager<User> fileManager;
	
	public UserRepository() throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<User>(FILENAME);
		
		this.users = this.fileManager.read();
	}
	

	@Override
	public void delete(String userName) throws IOException {
		
		this.users.remove(findByName(userName));
		this.fileManager.write(this.users);
	}



	@Override
	public Set<User> findAll() {
		return this.users;
	}

	@Override
	public User findByName(String name) {
		for (User user : users) {
			if (name.equals(user.getUserName())) {
				return user;
			}
		}
		
		return null;
	}
	
	
	@Override
	public boolean isExist(String userName) {
		for (User user : users) {
			if (userName.equals(user.getUserName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void add(User user) throws Exception {
		if (user == null) {
			throw new Exception("must have a value");
		}
		
		if (isExist(user.getUserName())) {
			throw new Exception("UserName already exist ! ");
		}
		this.users.add(user);
		this.fileManager.write(this.users);
	}
	
	// check login for user compare the name and password of user .
	public boolean check_login(String userName,char[] password) {
		User user;
		
		user = this.findByName(userName);
		// if user not in the DB 
		if(user==null)
			return false;
		
		// if user in DB then compare password if all good return true 
		if(user.getPassword().equals(password.toString()))
		return true;
		
		return false;
	}

}
	
	

