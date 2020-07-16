package DataBase;

import java.io.IOException;
import java.util.Set;
import java.util.regex.Pattern;

import model.Client;


public class ClientRepository implements ClientRepositoryInterface{
	
	private String FILENAME;
	private Set<Client> users;
	private FileManager<Client> fileManager;
	
	public ClientRepository() throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<Client>("clients");
		this.FILENAME="clients";

		this.users = this.fileManager.read();
	}
	
	public ClientRepository(String fileName) throws IOException, ClassNotFoundException {
		this.fileManager = new FileManager<Client>(fileName);
		this.FILENAME=fileName;
		this.users = this.fileManager.read();
	}
	
	
	@Override
	public void add(Client user) throws Exception {
	
		if (user == null) {
			throw new Exception("must have a value");
		}
		
		if (isExist(user.getUserName())) {
			throw new Exception("UserName already exist ! ");
		}
		this.users.add(user);
		this.fileManager.write(this.users);
	}

	@Override
	public void delete(String userName) throws IOException {	
		this.users.remove(findByName(userName));
		this.fileManager.write(this.users);
	}

	@Override
	public Set<Client> findAll() {
		
		return this.users;
	}

	@Override
	public Client findByName(String name) {
		for (Client user : users) {
			if (name.equals(user.getUserName())) {
				return user;
			}
		}
		return null;
	}
	//get the user premissions
	public String getClientPremission(String name) {
		Client temp;
		temp = this.findByName(name);
		
		return temp.getPermission();
	}

	@Override
	public boolean isExist(String userName) {
		if(findByName(userName)==null)
			return false;
		else 
			return true;
	}
	
	// check login for user compare the name and password of user .
	public boolean check_login(String userName,char[] password) {
		Client user;
		
		user = this.findByName(userName);
		// if user not in the DB 
		if(user==null)
			return false;
		// if user in DB then compare password if all good return true 
		if(user.getPassword().equals(new String(password)))
		return true;
		
		System.out.print(user.getPassword());
		System.out.print(password);
		
		return false;
	}
	
	@Override
	public Client findByEmail (String email) {
		for (Client user : users) {
			if (email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean isUserNameExist(String userName) {
		if(findByName(userName)==null)
			return false;
		else 
			return true;
	}
	
	@Override
	public boolean isEmailExist(String email) {
		if(findByEmail(email)==null)
			return false;
		return true;
	}


@Override
	public boolean isValidName(String str) {
        char[] strCharArray = str.toCharArray();

		 for (char charInArray : strCharArray)
	        {
		         if (!(Character.isLetter(charInArray)))
		        	 return false;
	        }
		 return true;
	}
	
	@Override
    public boolean isValidEmail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    
	@Override
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

	public Set<Client> getUsers() {
		return users;
	}

}
