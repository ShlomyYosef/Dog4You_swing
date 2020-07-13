package model;

public class Dog {
	
	private String Name;
    private String Breed;
	private String Character;
	private String FinalSize;
	private String Location;
	private String dogAge;
	private String KennelUserName;
	private boolean Vaccsine;
	private boolean Furtille;
	private boolean Tamed;
	

	public Dog(String name, String breed, String character, String finalSize, String location, String age, String KennelUserName,
			boolean vaccsine, boolean furtille, boolean tamed) {
		
	setName(name);
	setBreed(breed);
	setCharacter(character);
	setFinalSize(finalSize);
	setLocation(location);
	setDogAge(age);
	setKennelUserName(KennelUserName);
	setVaccsine(vaccsine);
	setFurtille(furtille);
	setTamed(tamed);	
	}


	private void setDogAge(String age) {
		this.dogAge = age;	
	}


	public String getName() {
		return this.Name;
	}


	public String getBreed() {
		return this.Breed;
	}


	public String getCharacter() {
		return this.Character;
	}


	public String getFinalSize() {
		return this.FinalSize;
	}


	public String getLocation() {
		return this.Location;
	}


	public String getDogAge() {
		return this.dogAge;
	}


	public boolean isVaccsine() {
		return this.Vaccsine;
	}


	public boolean isFurtille() {
		return this.Furtille;
	}


	public boolean isTamed() {
		return this.Tamed;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public void setBreed(String breed) {
		this.Breed = breed;
	}


	public void setCharacter(String character) {
		this.Character = character;
	}


	public void setFinalSize(String finalSize) {
		this.FinalSize = finalSize;
	}


	public void setLocation(String location) {
		this.Location = location;
	}

	public void setVaccsine(boolean vaccsine) {
		this.Vaccsine = vaccsine;
	}


	public void setFurtille(boolean furtille) {
		this.Furtille = furtille;
	}


	public void setTamed(boolean tamed) {
		this.Tamed = tamed;
	}


	public String getKennelUserName() {
		return this.KennelUserName;
	}


	public void setKennelUserName(String kennelUserName) {
		this.KennelUserName = kennelUserName;
	}


}
