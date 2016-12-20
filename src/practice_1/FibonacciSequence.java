package practice_1;

import java.util.Scanner;

class Fibonacci {
	public static long FibonacciS(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return FibonacciS(n - 1) + FibonacciS(n - 2);
	}
}

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;

		System.out.println("輸入要顯示幾個費氏數列");

		if (scan.hasNextInt())
			x = scan.nextInt();

		for (int i = 0; i <= x; i++) {
			System.out.println("第" + i + "個數 = " + Fibonacci.FibonacciS(i));
		}
	}

}
