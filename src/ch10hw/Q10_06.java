package ch10hw;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q10_06 {

	public static void main(String[] args) {
		File f1 = new File("D:\\data\\Object.dat");
		try (FileInputStream fis = new FileInputStream(f1); ObjectInputStream ois = new ObjectInputStream(fis);) {
			while (true) {
				try {
					Mammal o = (Mammal) ois.readObject();
					if (o instanceof Cat) {
						Cat c = (Cat) o;
						c.smile();
					} else if (o instanceof Dog) {
						Dog d = (Dog) o;
						d.smile();
					} else {
						System.out.println("無此型別");
					}
				} catch (EOFException e) {
					System.out.println("檔案讀取完畢");
					break;
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
