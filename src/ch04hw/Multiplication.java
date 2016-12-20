package ch04hw;

public class Multiplication {

	public static void main(String[] args) {
		int sum = 1;
		for (int i = 1; i <= 10; i++) { // 以for迴圈做1~10連乘
			sum *= i;
		}
		System.out.println("以for迴圈做1~10連乘=" + sum);

		int sum1 = 1, x = 1;
		while (x <= 10) { // 以while迴圈做1~10連乘
			sum1 *= x;
			x++;
		}
		System.out.println("以while迴圈做1~10連乘=" + sum1);

	}

}
