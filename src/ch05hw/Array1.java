package ch05hw;

public class Array1 {
	public static void main(String[] args) {
		double sum = 0;
		double ar[] = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };

		for (int i = 0; i < 10; i++) { // �i���`�M���B��
			sum += ar[i];
		}

		System.out.println("������=" + (sum / 10.0));
		System.out.println("�H�U�Ʀr�j�󥭧���");

		for (int y = 0; y < 10; y++) { // �����ƬO�_�j�󥭧���
			if (ar[y] > (sum / 10.0)) {
				System.out.println(ar[y]);
			}
		}
	}
}
