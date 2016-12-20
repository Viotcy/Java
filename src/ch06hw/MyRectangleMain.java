package ch06hw;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle R1 = new MyRectangle(); // 以方法設定參數
		MyRectangle R2 = new MyRectangle(10, 20);// 以建構子設定參數

		R1.setWidth(10);
		R1.setDepth(20);

		System.out.println("R1面積 = " + R1.getArea());
		System.out.println("R2面積 = " + R2.getArea());

		System.out.println(R1.equals(R2));
	}

}
