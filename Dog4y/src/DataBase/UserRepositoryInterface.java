package DataBase;

import java.io.IOException;
import java.util.Set;
import model.User;


public interface UserRepositoryInterface {

	void add(User user) throws Exception;

	void delete(String userName) throws IOException;

	Set<User> findAll();

	User findByName(String name);

	boolean isExist(String userName);
	
}
