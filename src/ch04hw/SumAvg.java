package ch04hw;

public class SumAvg {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int x = (int) (Math.random() * 100) + 1;// ��1~100���o10�Ӷü�
			sum += x;
			System.out.println("x=" + x);
		}
		System.out.println("sum=" + sum);
		System.out.println("avg=" + (float) (sum / 10.0));
	}
}
