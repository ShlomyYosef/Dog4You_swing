package DataBase;

import java.io.IOException;
import java.util.Set;

import model.Dog;

public interface DogRepoInterface {
	
	void add(Dog dog) throws Exception;

	void delete(Dog dog) throws IOException;

	Set<Dog> findAll();

	Set<Dog> findByRace(String race);
	
	Set<Dog> findByAge(int age);

	boolean isExist(Dog check);
}
