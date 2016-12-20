package practice_1;

import java.util.Scanner;

public class ScroeClass_if {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入10的分數(介於0~100)");

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
		System.out.println("100~90有" + a + "人");
		System.out.println("89~80有" + b + "人");
		System.out.println("79~70有" + c + "人");
		System.out.println("69~60有" + d + "人");
		System.out.println("59~0有" + e + "人");
	}

}
