package ch04hw;

public class Multiplication {

	public static void main(String[] args) {
		int sum = 1;
		for (int i = 1; i <= 10; i++) { // �Hfor�j�鰵1~10�s��
			sum *= i;
		}
		System.out.println("�Hfor�j�鰵1~10�s��=" + sum);

		int sum1 = 1, x = 1;
		while (x <= 10) { // �Hwhile�j�鰵1~10�s��
			sum1 *= x;
			x++;
		}
		System.out.println("�Hwhile�j�鰵1~10�s��=" + sum1);

	}

}
