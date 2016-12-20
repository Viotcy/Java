package ch03hw;

public class SquareCircle {

	public static void main(String[] args) {
		int x = 10;
		int s = (x * x); // 計算正方面積
		double rs = (x * 0.5) * (x * 0.5) * Math.PI;// 計算內接圓面積
		System.out.println("正方形面積=" + s);
		System.out.println("內接圓面積差=" + rs);
		System.out.println("面積差=" + (s - rs));
	}

}
