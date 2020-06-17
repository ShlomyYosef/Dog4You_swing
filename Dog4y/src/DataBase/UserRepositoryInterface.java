package DataBase;

import java.io.IOException;
import java.util.Set;
import model.User;


public interface UserRepositoryInterface {

	void add(User user) throws Exception;

	void delete(int id) throws IOException;

	User find(int id);

	Set<User> findAll();

	User findByName(String name);
	
}
