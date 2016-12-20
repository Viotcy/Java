package ch10hw;

import java.io.File;
import java.util.Scanner;

public class Q10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("請輸入檔案路徑");

		if (scan.hasNext()) {
			File f1 = new File(scan.next());

			if (f1.exists()) {
				System.out.println("該檔案 = " + f1.length() + " 個位元組");
			} else {
				System.out.println("檔案不存在");
			}
		}
		scan.close();
	}
}
