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
			System.out.println("Sample.txt�t��"+f1.length()+"�Ӧ줸�աA"+fr.read(c)+"�Ӧr���A"+x+"�C���");
					
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
