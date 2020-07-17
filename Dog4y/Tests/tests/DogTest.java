package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import DataBase.DogRepository;
import model.Dog;

public class DogTest {

	private static DogRepository testDogRepository;
	Dog Dogy = new Dog("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3","0528475414", "Male",true, false, true);
	Dog Hetz = new Dog("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5","0528475414", "Female",true, false, true);
	Dog Bunny = new Dog("bunny","German Shepherd","Independent", "Medium","South", "Young", "David45","0528475414", "Female",true, true, true);
	Dog Rey = new Dog("rey","Boxer","Shy/Timid", "Small", "Center", "Adult", "Avi3","0528475414", "Female",false, false, true);
	Dog Bob = new Dog("bob","Bulldog","Independent", "Small", "South", "Young", "David45","0528475414", "Female",true, false, true);
	Dog Nil = new Dog("nil","Beagle","Independent", "Medium","South", "Young", "David45","0528475414", "Female",true, true, true);

	@BeforeClass
	public static void beforeAll() 
	{
		try {
			testDogRepository= new DogRepository("dogTestFile");
		}
		catch(Exception e) {
		System.out.print(e);
		}
	}
	
	@Before
	public void clearTheRepository() {
		testDogRepository.removeAllDogs();
	}
	
	@Test
	public void testSizeOFRepositoryAfterAddingDogs() throws Exception {
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Hetz = ("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5", "Female",true, false, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Hetz);
		assertEquals("there are more or less then 2 dogs",2,testDogRepository.getDogsSize());
		testDogRepository.delete(Dogy);
		assertEquals("there are more or less then 1 dogs",1,testDogRepository.getDogsSize());
	}
	
	@Test
	public void testDeleteAllDogsKennel() throws Exception {
		
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Hetz = ("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5", "Female",true, false, true)
//		Bunny = ("bunny","German Shepherd","Independent", "Medium","South", "Young", "David45", "Female",true, true, true)
//		Rey = ("rey","Boxer","Shy/Timid", "Small", "Center", "Adult", "Avi3", "Female",false, false, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Hetz);
		testDogRepository.add(Bunny);
		testDogRepository.add(Rey);
		assertEquals("there are more or less then 4 dogs",4,testDogRepository.getDogsSize());
		try {
		testDogRepository.deleteAllDogsKennel("Avi3");
		}
		catch(Exception e) {
			System.out.print(e);
			}
		assertEquals("there are more or less then 1 dogs",2,testDogRepository.getDogsSize());
	}

	@Test
	public void findDogsByRace() throws Exception {
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Hetz = ("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5", "Female",true, false, true)
//		Bunny = ("bunny","German Shepherd","Independent", "Medium","South", "Young", "David45", "Female",true, true, true)
//		Bob = ("bob","Bulldog","Independent", "Small", "South", "Young", "David45", "Female",true, false, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Hetz);
		testDogRepository.add(Bunny);
		testDogRepository.add(Bob);
		
		assertEquals("There is no 3 dogs", 2, testDogRepository.findByRace("Bulldog").size());
		assertEquals("There is no 3 dogs", 2, testDogRepository.findByKennel("David45").size());

	}
	
	@Test
	public void testIsDogExist() throws Exception {
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Bob = ("bob","Bulldog","Independent", "Small", "South", "Young", "David45", "Female",true, false, true)
//		Nil = ("nil","Beagle","Independent", "Medium","South", "Young", "David45", "Female",true, true, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Bob);
		testDogRepository.add(Nil);
		assertTrue(testDogRepository.isExist(Dogy));
		
		testDogRepository.delete(Dogy);
		
		assertFalse(testDogRepository.isExist(Dogy));
		assertTrue(testDogRepository.isExist(Bob));
		assertTrue(testDogRepository.isExist(Nil));
				
	}

	@Test
	public void testfindDogByBreedAgeLocation() throws Exception {
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Hetz = ("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5", "Female",true, false, true)
//		Bunny = ("bunny","German Shepherd","Independent", "Medium","South", "Young", "David45", "Female",true, true, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Hetz);
		testDogRepository.add(Bunny);
		assertEquals("There are more/less then 1 dog", 1,testDogRepository.findDogByBreedAgeLocation("Beagle", "Young", "South").size());
		
	}
	
	@Test
	public void testfindAdvanced() throws Exception {
//		Dogy = ("dogy","Bulldog","Confident", "Large","South", "Young", "Avi3", "Male",true, false, true)
//		Hetz = ("hetz","Beagle","Independent", "Small", "South", "Young", "Dany5", "Female",true, false, true)
//		Bunny = ("bunny","German Shepherd","Independent", "Medium","South", "Young", "David45", "Female",true, true, true)
		
		testDogRepository.add(Dogy);
		testDogRepository.add(Hetz);
		testDogRepository.add(Bunny);
		assertEquals("There are more/less then 1 dog", 1, 
				testDogRepository.findAdvanced("Bulldog", "Young", "South", "Confident", true, true, false).size());
		
		
		
	}
}
