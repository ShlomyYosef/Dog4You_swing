package model;

public class Client {

	protected String Name;
	protected String Password;
	protected String Address;
	protected int Id;
	protected int Age;

	void CreateUser()
	{
		
	}
	void Login()
	{
		
	}
	void ChangePassword()
	{
		
	}
	
	void ForgotPassword()
	{
		
	}
	void Validation()
	{
		
	}
	
	
	public String getName() 
	{
		return this.Name;
	}
	public String getPassword() {
		return this.Password;
	}
	public String getAddress() {
		return this.Address;
	}
	public int getId() {
		return this.Id;
	}
	public int getAge() {
		return this.Age;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	
}
