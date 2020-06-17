package DataBase;

import java.io.IOException;
import java.util.Set;
import model.User;

public class UserRepository implements UserRepositoryInterface {

	private final String FILENAME = "users";
	private Set<User> users;
	private FileManager<User> fileManager;
	
	public UserRepository() throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<User>(FILENAME);
		
		this.users = this.fileManager.read();
	}
	
	@Override
	public void add(User user) throws Exception {
		if (user == null) {
			throw new Exception("must have a value");
		}
		
		if (this.users.contains(user)) {
			throw new Exception("Already exists!");
		}
		
		this.users.add(user);
		this.fileManager.write(this.users);
	}

	@Override
	public void delete(int id) throws IOException {
		this.users.remove(new User(id));
		this.fileManager.write(this.users);
	}

	@Override
	public User find(int id) {
		if (this.users.contains(new User(id))) {
			for (User user : users) {
				if (User.getIdCounter() == id) {
					return user;
				}
			}
		}
		
		return null;
	}

	@Override
	public Set<User> findAll() {
		return this.users;
	}

	@Override
	public User findByName(String name) {
		for (User user : users) {
			if (name.equals(user)) {
				return user;
			}
		}
		
		return null;
	}


}
