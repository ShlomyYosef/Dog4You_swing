package DataBase;

import java.io.IOException;
import java.util.Set;

import model.Dog;





public class DogRepository implements DogRepoInterface {
	
	
	private final String FILENAME = "dogs";
	private Set<Dog> dogs;
	private FileManager<Dog> fileManager;
	private Set<Dog> result;

	
	public DogRepository() throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<Dog>(FILENAME);
		
		this.dogs = this.fileManager.read();
	}
	
	
	@Override
	public void add(Dog dog) throws Exception {
		// TODO Auto-generated method stub
		if(dog==null) {
			throw new Exception("must have a value");
		}
			
		dogs.add(dog);
		//save new list to file 
		this.fileManager.write(this.dogs);
	}

	@Override
	public void delete(Dog dog) throws IOException {
		// TODO Auto-generated method stub
		if(dog!=null)
		dogs.remove(dog);
		
		//save new list to file 
		this.fileManager.write(this.dogs);
			
	}

	@Override
	public Set<Dog> findAll() {	
		return this.dogs;
	}

	@Override
	public Set<Dog> findByRace(String race) {
		// TODO Auto-generated method stub
        result.clear();
		for (Dog dog: dogs) {
			if(race.equals(dog.getRace())) {
				result.add(dog);
			}
		}
		return result;
	}

	@Override
	public Set<Dog> findByAge(int age) {
        result.clear();
		for (Dog dog: dogs) {
			if(age==dog.getDogAge()) {
				result.add(dog);
			}
		}
		return result;
	}

	@Override
	public boolean isExist(Dog check) {
		// TODO Auto-generated method stub
		for (Dog dog: dogs) {
			if(check.equals(dog)) {
				return true;
			}
		}
		return false;
	}

}
