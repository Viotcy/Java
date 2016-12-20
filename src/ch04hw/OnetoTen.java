package ch04hw;

public class OnetoTen {

	public static void main(String[] args) {
		int x, y;
		for (x = 10; x >= 1; x--) { // ¥~°j°é
			for (y = 1; y <= x; y++) { // ¤º°j°é
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
