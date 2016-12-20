package ch06hw;

import java.util.Scanner;

//進行n階乘的運算

public class Factorial {

	public static void main(String[] args) {

		Factorial1 f = new Factorial1();
		Scanner scan = new Scanner(System.in);
		int a = 0;

		System.out.println("輸入所需階乘");

		if (scan.hasNextInt()) {
			a = scan.nextInt();
		}

		System.out.println(a + "階乘 = " + f.factorial(a));
	}
}

class Factorial1 {
	long factorial(int n) {

		long sum = 1;

		if (n == 0) { // 0! = 1
			return 1;
		}
		if (n == 1) { // 1! = 1
			return 1;
		}
		if (n != 1) {
			sum = n * factorial(n - 1); // 用遞迴來進行連乘
		}

		return sum;

	}
}