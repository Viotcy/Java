package ch03hw;

import java.util.Scanner;

public class Caculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 取得輸入的數字
		System.out.println("請輸入兩個整數");
		int a = 0, b = 0;
		if (scan.hasNext())
			a = scan.nextInt(); // 取得第一個鍵值
		if (scan.hasNext())
			b = scan.nextInt(); // 取得第二個鍵值
		System.out.println("和=" + (a + b));
		System.out.println("差=" + (a - b));
		System.out.println("積=" + (a * b));
		if (b != 0) { // b不可為0
			System.out.println("商=" + (a / b));
			System.out.println("餘數=" + (a % b));
		} else {
			System.out.println("0不可為分母");
		}

	}
}
