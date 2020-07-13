package model;

import java.util.ArrayList;
import java.util.List;

public class DogDetails {


	private ArrayList <String> Presonality = new ArrayList <String>();
	private ArrayList <String> Age = new ArrayList <String>();
	private ArrayList <String> Location = new ArrayList <String>();
	private ArrayList <String> Breed = new ArrayList <String>();
	
	// maybe insted of use add manually 
	
	//    List<String> list = Arrays.asList("foo", "bar");

	
	
//maybe all the add for each list will be in the constructor	
	public DogDetails(ArrayList<String> presonality, ArrayList<String> age, ArrayList<String> location,ArrayList<String> Breed) {
		super();
		Presonality = presonality;
		Age = age;
		Location = location;
		Breed = Breed;
	}
	
	public ArrayList<String> getPresonality() {
		return Presonality;
	}
	public void setPresonality(ArrayList<String> presonality) {
		Presonality = presonality;
		Presonality.add("Confident");
		Presonality.add("Shy/Timid");
		Presonality.add("Independent");
		Presonality.add("Friendly");
		Presonality.add("Adaptable");	
	}
	public ArrayList<String> getAge() {
		return Age;
	}
	public void setAge(ArrayList<String> age) {
		Age = age;
		Age.add("Puppy");
		Age.add("Young");
		Age.add("Adult");
		Age.add("Senior");
	}
	public ArrayList<String> getLocation() {
		return Location;
	}
	public void setLocation(ArrayList<String> location) {
		Location = location;
		Location.add("South");
		Location.add("Center");
		Location.add("North");
	}

	public ArrayList<String> getBreed() {
		return Breed;
	}

	public void setBreed(ArrayList<String> breed) {
		Breed = breed;
		Breed.add("Beagle");
		Breed.add("Bulldog");
		Breed.add("Pit Bull");
		Breed.add("Belgian Tervuren");
		Breed.add("Boxer");
		Breed.add("German Shepherd");
		Breed.add("Golden Retriever");
		Breed.add("Jack Russell Terrier");
		Breed.add("Labrador Retriever");
		Breed.add("Pug");
		Breed.add("Rottweiler");
	}
	
}
