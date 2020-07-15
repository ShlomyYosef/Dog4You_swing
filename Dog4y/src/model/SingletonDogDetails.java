package model;
//using singletone pattern
public class SingletonDogDetails {

	private static SingletonDogDetails firstInstance=null;
	
	private String[] Age = {"","Puppy", "Young","Adult","Senior"};
	private String[] Personality = {"","Confident", "Shy/Timid","Independent","Friendly","Adaptable"};
	private String[] Location = {"","South", "Center","North"};
	private String[] Breed = {"","Beagle", "Bulldog","Pit Bull","Belgian Tervuren","Boxer","German Shepherd","Golden Retriever","Jack Russell Terrier","Labrador Retriever","Pug","Rottweiler"};
	private String[] FinalSize = {"","Small","Medium","Large"};
	private String[] Gender = {"","male", "female"};
	
	private  SingletonDogDetails() {}
	
	public static SingletonDogDetails getInstance() {
		if(firstInstance==null) {
			firstInstance = new SingletonDogDetails();
		}
		return firstInstance;
	}
	public String[] getAge() {
		return Age;
	}
	public String[] getPersonality() {
		return Personality;
	}
	public String[] getLocation() {
		return Location;
	}
	public String[] getBreed() {
		return Breed;
	}
	public String[] getFinalSize() {
		return FinalSize;
	}
	public String[] getGender() {
		return Gender;
	}
	

}
