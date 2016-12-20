package ch10hw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q10_05 {
	public static void main(String[] args) {
		Cat kitty = new Cat("kitty");
		Cat garfield = new Cat("garfield");
		Dog snoopy = new Dog("snoopy");
		Dog dog = new Dog("dog");
		File f1 = new File("D:\\data");
		if (!f1.exists()) {
			f1.mkdirs();
		}
		File f2 = new File(f1,"Object.dat");
		try (FileOutputStream fos = new FileOutputStream(f2); 
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(kitty);
			oos.writeObject(garfield);
			oos.writeObject(snoopy);
			oos.writeObject(dog);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
