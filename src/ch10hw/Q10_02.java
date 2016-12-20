package ch10hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_02 {
	public static void main(String[] args) {
		File f1 = new File("D:\\_Java\\Sample.txt");
		try (   FileInputStream fis = new FileInputStream(f1);
				FileReader fr = new FileReader(f1);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) {
			char c[] = new char[8192];
			int x = 0;
			while (br.readLine() != null) {
				x++;
			}
			System.out.println("Sample.txt含有"+f1.length()+"個位元組，"+fr.read(c)+"個字元，"+x+"列資料");
					
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
