package ch03hw;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�M��J3�Ӧr��");
		String str1 = "", str2 = "", str3 = "";
		if (scan.hasNext())
			str1 = scan.next(); // ���o�Ĥ@�Ӧr��
		if (scan.hasNext())
			str2 = scan.next(); // ���o�ĤG�Ӧr��
		if (scan.hasNext())
			str3 = scan.next(); // ���o�ĤT�Ӧr��
		System.out.println("�r��1����=" + str1.length()); // �L�X�r�����
		System.out.println("�r��2����=" + str2.length());
		System.out.println("�r��3����=" + str3.length());

	}

}
