package ch06hw;

import java.util.Scanner;

//�i��n�������B��

public class Factorial {

	public static void main(String[] args) {

		Factorial1 f = new Factorial1();
		Scanner scan = new Scanner(System.in);
		int a = 0;

		System.out.println("��J�һݶ���");

		if (scan.hasNextInt()) {
			a = scan.nextInt();
		}

		System.out.println(a + "���� = " + f.factorial(a));
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
			sum = n * factorial(n - 1); // �λ��j�Ӷi��s��
		}

		return sum;

	}
}