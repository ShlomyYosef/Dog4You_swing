package model;

public class Client extends User{
	

	private static final long serialVersionUID = 1L;
	private String Name;
	private String Address;
	private int Age;
	private String PhoneNumber;
	private int idNumber;

	public Client(String email, String userName, String password,String name, String address, int age, String phoneNumber, int idNumber) {
		
		super(email, userName, password);
		    setName(name);
			setAddress(address);
			setAge(age);
			setPhoneNumber(phoneNumber);	
			setIdNumber(idNumber);
	}

    	
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}
	
	public String getName() 
	{
		return this.Name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public int getAge() {
		return this.Age;
	}
	public void setName(String name) {
		this.Name = name;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	public void setIdNumber(int id) {
		this.idNumber = id;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getAddress() {
		return this.Address;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
}
