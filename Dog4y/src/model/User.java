package model;

public class User extends Client {

	private String PhoneNumber;
	private String Email;
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	
}

