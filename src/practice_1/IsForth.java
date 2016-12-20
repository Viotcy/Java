package practice_1;

public class IsForth {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2001; i <= 2400; i++) {
			if (i % 4 == 0 && i % 100 != 0 && i % 400 != 0) {
               sum++;
			}
		}
		System.out.println("是4的倍數不是100或400的倍數共有"+sum+"個");

	}

}
