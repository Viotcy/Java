package ch05hw;

public class Array1 {
	public static void main(String[] args) {
		double sum = 0;
		double ar[] = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };

		for (int i = 0; i < 10; i++) { // 進行總和的運算
			sum += ar[i];
		}

		System.out.println("平均數=" + (sum / 10.0));
		System.out.println("以下數字大於平均數");

		for (int y = 0; y < 10; y++) { // 比較資料是否大於平均數
			if (ar[y] > (sum / 10.0)) {
				System.out.println(ar[y]);
			}
		}
	}
}
