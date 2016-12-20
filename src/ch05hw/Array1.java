package ch05hw;

public class Array1 {
	public static void main(String[] args) {
		double sum = 0;
		double ar[] = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };

		for (int i = 0; i < 10; i++) { // 秈︽羆㎝笲衡
			sum += ar[i];
		}

		System.out.println("キА计=" + (sum / 10.0));
		System.out.println("计キА计");

		for (int y = 0; y < 10; y++) { // ゑ耕戈琌キА计
			if (ar[y] > (sum / 10.0)) {
				System.out.println(ar[y]);
			}
		}
	}
}
