package practice_1;

import java.util.Scanner;

public class FileName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�ɮצW��");
		String s = "";
		
		if (scan.hasNext()) {
			s = scan.next();
		}
		if (s.length() <= 20) {
			System.out.println(s);
		} else {
			s = s.substring(0, (20 - s.substring(s.indexOf(".")).length())) 
					+ s.substring(s.indexOf('.'));
			System.out.println(s);
		}

	}

}
