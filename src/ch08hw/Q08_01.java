package ch08hw;

public class Q08_01 {
	static void subroutine(String[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			try {
				sum += Integer.parseInt(ar[i]);
			} catch (Exception e) { // 發生例外時跳過此次迴圈繼續執行
				continue;
			}
			System.out.println("sum116516=" + sum);
		}
	}

	public static void main(String[] args) {
		subroutine(args);
	}

}
