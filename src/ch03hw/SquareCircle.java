package ch03hw;

public class SquareCircle {

	public static void main(String[] args) {
		int x = 10;
		int s = (x * x); // �p�⥿�譱�n
		double rs = (x * 0.5) * (x * 0.5) * Math.PI;// �p�⤺���ꭱ�n
		System.out.println("����έ��n=" + s);
		System.out.println("�����ꭱ�n�t=" + rs);
		System.out.println("���n�t=" + (s - rs));
	}

}
