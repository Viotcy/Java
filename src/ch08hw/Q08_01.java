package ch08hw;

public class Q08_01 {
	static void subroutine(String[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			try {
				sum += Integer.parseInt(ar[i]);
			} catch (Exception e) { // �o�ͨҥ~�ɸ��L�����j���~�����
				continue;
			}
			System.out.println("sum=" + sum);
		}
	}

	public static void main(String[] args) {
		subroutine(args);
	}

}
