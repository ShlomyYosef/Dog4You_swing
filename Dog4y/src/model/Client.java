package model;

public class Client extends User{
	

	private static final long serialVersionUID = 1L;
	private String Name;
	private String LastName;
	private String Address;
	private String Permission;
	private String PhoneNumber;


	public Client(String email, String userName, String password,String name,String lastName, String address, String phoneNumber,String permission) {
		
		super(email, userName, password);
		    setName(name);
		    setLastName(lastName);
			setAddress(address);
			setPermission(permission);
			setPhoneNumber(phoneNumber);	
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

	
	public void setName(String name) {
		this.Name = name;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	public String getAddress() {
		return this.Address;
	}



	public String getPermission() {
		return this.Permission;
	}


	public void setPermission(String permission) {
		this.Permission = permission;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		this.LastName = lastName;
	}


	@Override
	public String toString() {
		return "UserName: "+getUserName()+"    Client Name: " + Name + "    LastName: " + LastName + "    Permission: " + Permission ;
	}


}
