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
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		this.Race = race;
	}
	public String getCharacter() {
		return Character;
	}
	public void setCharacter(String character) {
		this.Character = character;
	}
	public String getFinalSize() {
		return FinalSize;
	}
	public void setFinalSize(String finalSize) {
		this.FinalSize = finalSize;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		this.Location = location;
	}
	public int getDogId() {
		return DogId;
	}
	public void setDogId(int dogId) {
		this.DogId = dogId;
	}
	public int getKennelId() {
		return KennelId;
	}
	public void setKennelId(int kennelId) {
		this.KennelId = kennelId;
	}
	public boolean isVaccsine() {
		return Vaccsine;
	}
	public void setVaccsine(boolean vaccsine) {
		this.Vaccsine = vaccsine;
	}
	public boolean isFurtille() {
		return Furtille;
	}
	public void setFurtille(boolean furtille) {
		this.Furtille = furtille;
	}
	public boolean isTamed() {
		return Tamed;
	}
	public void setTamed(boolean tamed) {
		this.Tamed = tamed;
	}
	
}
