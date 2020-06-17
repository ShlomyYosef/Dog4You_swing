package model;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
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
	
	public User(int id) {
		super();
		setIdCounter(id);
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


	private static void setIdCounter(long idCounter) {
		User.idCounter = idCounter;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (idCounter != other.idCounter)
			return false;
		return true;
	}

}

