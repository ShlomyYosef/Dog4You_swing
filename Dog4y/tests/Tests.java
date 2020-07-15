
	import static org.junit.Assert.*;
	import static org.junit.Assume.assumeNoException;
	import java.io.IOException;
	import org.junit.Before;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import DataBase.ClientRepository;
	import org.junit.rules.ExpectedException;
	import model.User;
	import model.Client;
	public class Tests {

		
		private static ClientRepository testRepository33;

		@BeforeClass
		public static void beforeAll() {
			
			try {
				testRepository33= new ClientRepository("stamTest");
			}
			catch(Exception e) {
			System.out.print(e);
				}			
			
			}
		
		
		
		@Test
		public void testEmailValidation() {
			String badEmail= "da@gmail.";
			String goodEmail = "abc@walla.com";
			
			assertFalse("Invalid email", testRepository33.isValidEmail(badEmail));
			assertTrue("Valid email", testRepository33.isValidEmail(goodEmail));

		}
		
		@Test
		public void testisValidPhone() {
			String badPhone= "0541232"; // 8 digits number-- invalid
			String goodPhone = "0523456789"; // valid number
			
			assertFalse("Invalid Phone", testRepository33.isValidPhone(badPhone));
			assertTrue("Valid Phone", testRepository33.isValidPhone(goodPhone));

		}
		
		@Test
		public void testisValidName() {
			String badName= "ad2r"; 
			String goodName = "adir"; 
			
			assertFalse("valid name", testRepository33.isValidName(badName));
			assertTrue("InValid name", testRepository33.isValidName(goodName));

		}
		
//		@Test(expected = Exception.class)
//		public void testAddNullUser() throws Exception {
//			Client user = new Client("","","","","","","","");
//			testRepository33.add(user);

//		}
		
		@Test(expected = Exception.class)
		public void testAddExistUser() throws Exception {
			Client user1 = new Client("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user");
			Client user2 = new Client("Avi34@gmail.com","avi1","12345","Avi","peretz","Tel-Aviv","0545343234","user");

			testRepository33.add(user1);
			testRepository33.add(user2);
		}
		
		@Test
		public void testIfUserExistAfterDelete() throws Exception {
			Client user = new Client("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user");
			testRepository33.add(user);
			testRepository33.delete("avi1");
			assertFalse("exist", testRepository33.isUserNameExist("avi1"));
		
		}
		
		@Test
		public void testCheckLoginValidation() throws Exception {
			String password="aszx";
			char[] charPassword= password.toCharArray();
			assertFalse("not exist",testRepository33.check_login("adirtest", charPassword));

			Client user = new Client("Avi@gmail.com","avi1","123","Avi","Cohen","Tel-Aviv","0521234567","user");
			testRepository33.add(user);
			String aviPassword="123";
			char[] charAviPassword= aviPassword.toCharArray();
			assertTrue("Not exist", testRepository33.check_login("avi1", charAviPassword));
			String wrongAviPassword="1234";
			char[] charWrongAviPassword= wrongAviPassword.toCharArray();
			assertFalse("exist", testRepository33.check_login("avi1", charWrongAviPassword));

		}
			
		@After
		public void clearTheRepository() throws IOException {
			for (Client testClient : testRepository33.getUsers()) {
				String userName = testClient.getUserName();
				testRepository33.delete(userName);
		}
		
			
		}
	}
	


		


