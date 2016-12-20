package ch10hw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q10_04 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("d:\\Data.txt", true);
				DataOutputStream oos = new DataOutputStream(fos);) {
			for (int i = 0; i < 10; i++) {
				oos.writeInt(new Integer((int) (Math.random() * 1000) + 1));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("d:\\Data.txt");
				DataInputStream ois = new DataInputStream(fis);) {
			while(true){
				try {
					Object o = ois.readInt();
					if (o instanceof Integer) {
						Integer i = (Integer) o;
						System.out.println("Integer = " + i);
					}
				} catch (EOFException e) {
					System.out.println("ÀÉ®×Åª¨ú§¹²¦");
					break;
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//			finally{
//			File f1=new File("d:\\Data.txt");
//			f1.delete();
		}
	}


