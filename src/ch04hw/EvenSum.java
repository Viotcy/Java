package ch04hw;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) { // 由1~1000
			if (i % 2 == 0) { // 判斷是否為偶數
				sum += i;
			}
		}
		System.out.println("偶數和=" + sum);
	}

}
