package ch08hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class Q08_02 {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		System.out.println("Program ends");
	}

	static void methodA() throws IOException, ArithmeticException {
		int i = 3 / 0;
		URL urlA = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("c:\\Test.txt");
	}
}
