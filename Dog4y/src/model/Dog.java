package model;

public class Dog {
	
	private String Name;
    private String Race;
	private String Character;
	private String FinalSize;
	private String Location;
	private int DogId;
	private int KennelId;
	private boolean Vaccsine;
	private boolean Furtille;
	private boolean Tamed;
	

	public Dog(String name, String race, String character, String finalSize, String location, int dogId, int kennelId,
			boolean vaccsine, boolean furtille, boolean tamed) {
		super();
	}


	public String getName() {
		return this.Name;
	}


	public String getRace() {
		return this.Race;
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


	public int getDogId() {
		return this.DogId;
	}


	public int getKennelId() {
		return this.KennelId;
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


	public void setRace(String race) {
		this.Race = race;
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


	public void setDogId(int dogId) {
		this.DogId = dogId;
	}


	public void setKennelId(int kennelId) {
		this.KennelId = kennelId;
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


}
