package model;

import java.util.regex.Pattern;

public class Helper {

	public boolean isValidPhone (String number) {
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
	
	public boolean isValidEmail(String email) { 
		
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	public boolean isValidName(String str) {
        char[] strCharArray = str.toCharArray();

		 for (char charInArray : strCharArray)
	        {
		         if (!(Character.isLetter(charInArray)))
		        	 return false;
	        }
		 return true;
	}
	
	
	
}
