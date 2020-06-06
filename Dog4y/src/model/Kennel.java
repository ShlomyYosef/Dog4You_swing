package model;

public class Kennel extends User{
	
	private String name;
	private String address;
	private String phoneNumber;
	
	
	public Kennel(String email, String userName, String password,String kennelName ,String kennelAddress,String kennelPhoneNumber) {
		super(email, userName, password);
		// TODO Auto-generated constructor stub
	   setName(kennelName);
	   setAddress(kennelAddress);
	   setPhoneNumber(kennelPhoneNumber);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
// use implement method to add remove and edit dogs 	
void AddDog()
{	
	
}
void RemoveDog()
{
	
}

void EditDog()
{
	
}
	

}
