package ch06hw;

//對陣列進行由小到大的排序

public class Sort {

	public static void main(String[] args) {
		int ar[] = { 5, 5, 42, 3, 47, 89 };
		Sort1 s = new Sort1();

		s.mysort(ar);

		for (int x = 0; x < ar.length; x++) {
			System.out.println(ar[x]);
		}

	}
}

class Sort1 {
	int[] mysort(int a[]) {
		int x[] = a;
		int temp;

		for (int i = 0; i < x.length; i++) { // 進行排序的迴圈
			for (int y = 0; y < i; y++) {
				if (x[i] < x[y]) {
					temp = x[i];
					x[i] = x[y];
					x[y] = temp;
				}
			}
		}
		return x;
	}
}