package ch10hw;

import java.io.File;
import java.util.Scanner;

public class Q10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�п�J�ɮ׸��|");

		if (scan.hasNext()) {
			File f1 = new File(scan.next());

			if (f1.exists()) {
				System.out.println("���ɮ� = " + f1.length() + " �Ӧ줸��");
			} else {
				System.out.println("�ɮפ��s�b");
			}
		}
		scan.close();
	}
}
