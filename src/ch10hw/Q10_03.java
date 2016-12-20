package ch10hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q10_03 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("d:\\Data.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeDouble(new Double(17.625));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("d:\\Data.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object o = ois.readDouble();
			System.out.println(o);
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
