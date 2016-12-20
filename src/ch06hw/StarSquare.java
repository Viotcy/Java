package ch06hw;

import java.util.Scanner;

//以*產生width*height的實心長方形

public class StarSquare { // 產生的方法類別

	public static void main(String[] args) { // 對方法進行測試
		StarSquare1 s = new StarSquare1();
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		
		System.out.println("輸入長方形寬和高");
		
		if(scan.hasNextInt()){
			a=scan.nextInt();
		}
		if(scan.hasNextInt()){
			b=scan.nextInt();
		}
		s.starSquare(a, b);
	}
}

class StarSquare1 { // 產生的方法類別

	void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int y = 1; y <= width; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}