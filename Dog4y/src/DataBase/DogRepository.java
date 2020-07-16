package DataBase;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.Dog;

public class DogRepository implements DogRepoInterface {
	
	
	private final String FILENAME = "dogsDB";
	private Set<Dog> dogs;
	private FileManager<Dog> fileManager;
	private Set<Dog> result;

	
	public DogRepository() throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<Dog>(FILENAME);
		
		this.dogs = this.fileManager.read();
		this.result = new HashSet<Dog>();
		
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
	public void deleteAllDogsKennel(String kennelUserName) throws IOException {
		// TODO Auto-generated method stub
		if(kennelUserName!=null) {
			System.out.println(dogs.size());
			try {
				Iterator<Dog> iter;
				for(iter = dogs.iterator(); iter.hasNext(); ) {
					Dog dog = iter.next();
				    if(kennelUserName.equals(dog.getKennelUserName())){
				        iter.remove();
				    } 
				}
			}
			catch(Exception err) {
				System.out.println(err);
			}
		}	
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
		if(!result.isEmpty())
        result.clear();
		
		for (Dog dog: dogs) {
			if(race.equals(dog.getBreed())) {
				result.add(dog);
			}
		}
		return result;
	}

	@Override
	public Set<Dog> findByKennel(String kennel) {
		if(!result.isEmpty())
        result.clear();
		
		for (Dog dog: dogs) {
			if(kennel.equals(dog.getKennelUserName())) {
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

	public Set<Dog> findDogByBreedAgeLocation(String breed,String age,String location){
		//clear last results
		if(!result.isEmpty())
		result.clear();
		
	
		for(Dog dog:dogs) {
			if(breed.equals(dog.getBreed()) && age.equals(dog.getDogAge()) && location.equals(dog.getLocation())){		
				result.add(dog);	
			}
			}
		
			return result;
	}
	
	// if user search by all fields 
	public Set<Dog>findAdvanced(String breed,String age,String location,String personality,boolean vaccine,boolean tamed,boolean furtille){
		
		//clear last results
		if(!result.isEmpty())
		result.clear();
		
		for(Dog dog:dogs) {
			if(breed.equals(dog.getBreed()) && 
			age.equals(dog.getDogAge()) &&
			location.equals(dog.getLocation()) &&
			personality.equals(dog.getCharacter())&&
			tamed==dog.isTamed()&&
			furtille==dog.isFurtille()&&
			vaccine==dog.isVaccsine()){
				
				result.add(dog);	
			}
			
		}
		return result;
	}

}
