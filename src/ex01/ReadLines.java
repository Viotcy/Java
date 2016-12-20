package ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ReadLines {

	public static void main(String[] args) {
		File in = new File("D:\\_Java\\Data\\BIG5.txt");
		File out = new File("D:\\_Java\\Data\\BIG5_OUT.txt");
		try (
				FileInputStream fis = new FileInputStream(in);
				InputStreamReader isr = new InputStreamReader(fis, "BIG5");
				BufferedReader br = new BufferedReader(isr);
				FileOutputStream fos = new FileOutputStream(out);
				OutputStreamWriter osw = new OutputStreamWriter(fos,"BIG5");
				PrintWriter pw = new PrintWriter(osw); 
				) {
			    String line = null;
			    while((line=br.readLine())!=null){
				 System.out.println(line);
                 pw.println(line);				
			    }


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
