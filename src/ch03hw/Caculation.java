package ch03hw;

import java.util.Scanner;

public class Caculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ���o��J���Ʀr
		System.out.println("�п�J��Ӿ��");
		int a = 0, b = 0;
		if (scan.hasNext())
			a = scan.nextInt(); // ���o�Ĥ@�����
		if (scan.hasNext())
			b = scan.nextInt(); // ���o�ĤG�����
		System.out.println("�M=" + (a + b));
		System.out.println("�t=" + (a - b));
		System.out.println("�n=" + (a * b));
		if (b != 0) { // b���i��0
			System.out.println("��=" + (a / b));
			System.out.println("�l��=" + (a % b));
		} else {
			System.out.println("0���i������");
		}

	}
}
