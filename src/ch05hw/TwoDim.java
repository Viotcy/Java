package ch05hw;

public class TwoDim {

	public static void main(String[] args) {
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] rowsum = new int[6]; // �x�s�C�`�M���}�C
		int[] colsum = new int[8]; // �x�s���`�M���}�C

		for (int x = 0; x < 6; x++) { // �p��C�`�M
			for (int y = 0; y < 8; y++) {
				rowsum[x] += test[x][y];
			}
			System.out.println("�� [" + (x + 1) + "]�C�`�M= " + rowsum[x]);
		}

		System.out.println("--------------------");

		for (int x = 0; x < 8; x++) { // �p����`�M
			for (int y = 0; y < 6; y++) {
				colsum[x] += test[y][x];
			}
			System.out.println("�� [" + (x + 1) + "]���`�M= " + colsum[x]);
		}
	}
}
