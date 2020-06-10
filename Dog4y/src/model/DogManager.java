package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

public class DogManager implements DogDB {

	private Set<Dog> dogsData  = new HashSet<Dog>();
	private final String fileName = "dogs.dat";
	@SuppressWarnings("unchecked")
	@Override
	
	public Set<Dog> ReadDogFromFile(Dog dog) {

				File file = new File(fileName);
				if (file.length() == 0) {
					System.out.println("File is empty");
					return dogsData;
				}
				try (InputStream fileInputStream = new FileInputStream(fileName);
					 ObjectInputStream	objectInputStream = new ObjectInputStream(fileInputStream)) {			 
		     		 
					dogsData = (Set<Dog>) objectInputStream.readObject();

					
				} catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				return dogsData;
	}

	
	@Override
	public boolean WriteDogFromFile(Dog dog) {
		
		boolean addDogResult = dogsData.add(dog);
		boolean writeDogResult = false;
		
		try (OutputStream fileOutputStream = new FileOutputStream(fileName);
			 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
			objectOutputStream.writeObject(dogsData);
			writeDogResult = true;
		} catch (IOException e) {
			e.printStackTrace();
			writeDogResult = false;
		}

		return addDogResult && writeDogResult;
		
	}

}
