package ch06hw;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle R1 = new MyRectangle(); // �H��k�]�w�Ѽ�
		MyRectangle R2 = new MyRectangle(10, 20);// �H�غc�l�]�w�Ѽ�

		R1.setWidth(10);
		R1.setDepth(20);

		System.out.println("R1���n = " + R1.getArea());
		System.out.println("R2���n = " + R2.getArea());

		System.out.println(R1.equals(R2));
	}

}
