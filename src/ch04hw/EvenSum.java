package ch04hw;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) { // ��1~1000
			if (i % 2 == 0) { // �P�_�O�_������
				sum += i;
			}
		}
		System.out.println("���ƩM=" + sum);
	}

}
