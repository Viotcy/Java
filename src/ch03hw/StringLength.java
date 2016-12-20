package ch03hw;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("清輸入3個字串");
		String str1 = "", str2 = "", str3 = "";
		if (scan.hasNext())
			str1 = scan.next(); // 取得第一個字串
		if (scan.hasNext())
			str2 = scan.next(); // 取得第二個字串
		if (scan.hasNext())
			str3 = scan.next(); // 取得第三個字串
		System.out.println("字串1長度=" + str1.length()); // 印出字串長度
		System.out.println("字串2長度=" + str2.length());
		System.out.println("字串3長度=" + str3.length());

	}

}
