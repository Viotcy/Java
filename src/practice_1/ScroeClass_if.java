package practice_1;

import java.util.Scanner;

public class ScroeClass_if {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J10������(����0~100)");

		for (int i = 0; i < 10; i++) {
			if (scan.hasNextInt()) {
				score = scan.nextInt();
			}
			if (score <= 100 & score >= 90)
				a++;
			if (score <= 89 & score >= 80)
				b++;
			if (score <= 79 & score >= 70)
				c++;
			if (score <= 69 & score >= 60)
				d++;
			if (score <= 59 & score >= 0)
				e++;
		}
		System.out.println("100~90��" + a + "�H");
		System.out.println("89~80��" + b + "�H");
		System.out.println("79~70��" + c + "�H");
		System.out.println("69~60��" + d + "�H");
		System.out.println("59~0��" + e + "�H");
	}

}
