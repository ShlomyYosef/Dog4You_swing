package model;

public class User {
	
	private String Email;
	private String UserName;
	private String Password;
	private static long idCounter = 0;
	
	public User(String email, String userName, String password) {
		Email = email;
		UserName = userName;
		Password = password;
		setIdCounter(getIdCounter() + 1);
	}

	
	// option to implement interface login functions
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
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}
	

	public String getPassword() {
		return this.Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}


	public static long getIdCounter() {
		return idCounter;
	}


	public static void setIdCounter(long idCounter) {
		User.idCounter = idCounter;
	}

}

