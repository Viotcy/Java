package ch06hw;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle R1 = new MyRectangle(); // よ猭砞﹚把计
		MyRectangle R2 = new MyRectangle(10, 20);// 篶砞﹚把计

		R1.setWidth(10);
		R1.setDepth(20);

		System.out.println("R1縩 = " + R1.getArea());
		System.out.println("R2縩 = " + R2.getArea());

		System.out.println(R1.equals(R2));
	}

}
