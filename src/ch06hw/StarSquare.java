package ch06hw;

import java.util.Scanner;

//�H*����width*height����ߪ����

public class StarSquare { // ���ͪ���k���O

	public static void main(String[] args) { // ���k�i�����
		StarSquare1 s = new StarSquare1();
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		
		System.out.println("��J����μe�M��");
		
		if(scan.hasNextInt()){
			a=scan.nextInt();
		}
		if(scan.hasNextInt()){
			b=scan.nextInt();
		}
		s.starSquare(a, b);
	}
}

class StarSquare1 { // ���ͪ���k���O

	void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int y = 1; y <= width; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}