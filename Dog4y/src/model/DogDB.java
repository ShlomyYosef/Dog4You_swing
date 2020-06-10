package model;

import java.util.Set;

public interface DogDB {

	
	public Set<Dog> ReadDogFromFile(Dog dog);
	
	public boolean WriteDogFromFile(Dog dog);
	
	
}
