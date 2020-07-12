package model;

import java.io.Serializable;
import java.util.regex.Pattern;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String Email;
	private String UserName;
	private String Password;

	
	public User(String email, String userName, String password) {
		Email = email;
		UserName = userName;
		Password = password;
	//	setId(idCounter++);
	}
	
	public User(String userName) {
		setUserName(userName);
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

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (UserName != other.getUserName())
			return false;
		if(Email!=other.getEmail())
			return false;
		return true;
	}
	
	public String toString() {
		return "User [Email=" + Email + ", UserName=" + UserName + ", password=" + Password.toString() + "]";
	}
	
	public static boolean isNotOnlyLetters(String str) {
        char[] strCharArray = str.toCharArray();

		 for (char charInArray : strCharArray)
	        {
		         if (!(Character.isLetter(charInArray)))
		        	 return true;
	        }
		 return false;
	}
	/*public static boolean isValidEmail(String str) {
		char[] EmailInArray = str.toCharArray();
		boolean isValid=true;
		if (EmailInArray[0]=='@'|| !(str.contains("@"))) {
			isValid=false;
		}
		else {
			for (int i = 0; i<EmailInArray.length; i++) {
		}
		}
	*/
    public static boolean isValidEmail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

    public static boolean isValidPhone (String number) {
    	char [] phoneNumberInArray= number.toCharArray();
    	boolean isValid=true;
    	if (phoneNumberInArray.length<9) {
    		isValid=false;
    	}
    	else {
    	}
    		for(int i=0; i<phoneNumberInArray.length; i++) {
    			if (!Character.isDigit(phoneNumberInArray[i])) {
    				isValid =false;
    				break;
    		}
    	}
    	
    	return isValid;
    }
}

