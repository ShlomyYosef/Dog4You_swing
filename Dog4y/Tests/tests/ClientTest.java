package tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Client;
import model.Helper;
import DataBase.ClientRepository;

public class ClientTest {

	private static ClientRepository testClientRepository;
	private static Helper helper;
	Client aviCohen = new Client("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user");
	Client aviPeretz = new Client("Avi34@gmail.com","avi1","12345","Avi","peretz","Tel-Aviv","0545343234","user");
	Client aviCohenCopy= aviCohen;

	@BeforeClass
	public static void beforeAll() 
	{	
		try {
			testClientRepository= new ClientRepository("clientTestFile");
			helper=new Helper();
		}
		catch(Exception e) {
		System.out.print(e);
			}		
	}

	@Test
	public void testisValidPhone() {
		String badPhone= "0541232"; // 8 digits number - invalid
		String goodPhone = "0523456789"; // valid number
		
		assertFalse("Invalid Phone", helper.isValidPhone(badPhone));
		assertTrue("Valid Phone", helper.isValidPhone(goodPhone));
	}
	
	@Test
	public void testisValidName() {
		String badName= "ad2r"; 
		String goodName = "adir"; 
		
		assertFalse("valid name", helper.isValidName(badName));
		assertTrue("InValid name", helper.isValidName(goodName));
	}
	
	@Test(expected = Exception.class)
	public void testAddExistUser() throws Exception {
//		aviCohen = ("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user")
//		aviPeretz = ("Avi34@gmail.com","avi1","12345","Avi","peretz","Tel-Aviv","0545343234","user")

		testClientRepository.add(aviCohen);
		testClientRepository.add(aviPeretz);
	}
	
	@Test
	public void testIfUserExistAfterDelete() throws Exception {
//		aviCohen = ("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user")
		
		testClientRepository.add(aviCohen);
		testClientRepository.delete("avi1");
		assertFalse("exist", testClientRepository.isExist("avi1"));
	}
	
	@Test
	public void testCheckLoginValidation() throws Exception {
		String password="aszx";
		char[] charPassword= password.toCharArray();
		assertFalse("not exist",testClientRepository.check_login("adirtest", charPassword));

//		aviCohen = ("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user")
		
		testClientRepository.add(aviCohen);
		String aviPassword="123";
		char[] charAviPassword= aviPassword.toCharArray();
		assertTrue("Not exist", testClientRepository.check_login("avi1", charAviPassword));
		
		String wrongAviPassword="1234";
		char[] charWrongAviPassword= wrongAviPassword.toCharArray();
		assertFalse("exist", testClientRepository.check_login("avi1", charWrongAviPassword));
	}
		
	@Test
	public void testIfUsersEquals(){
//		aviCohen = ("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user")
//		aviCohenCopy = aviCohen
//		aviPeretz = ("Avi34@gmail.com","avi1","12345","Avi","peretz","Tel-Aviv","0545343234","user")
		
		assertTrue(aviCohen.equals(aviCohenCopy));
		assertFalse(aviCohen.equals(aviPeretz));
	}	
	
	@After
	public void clearTheRepository() throws IOException {
		for (Client testClient : testClientRepository.getUsers()) {
			String userName = testClient.getUserName();
			testClientRepository.delete(userName);
		}
	}
}
