package ch06hw;

//隨機產生6個1~42的亂數

public class RandomNum {
	public static void main(String[] args) {
		Luckynumber n = new Luckynumber();
		
		for (int i = 0; i < n.luckyNumber().length; i++) {
			System.out.println(n.luckyNumber()[i]);
		}
	}
}

class Luckynumber {               //亂數產生的方法
	int[] luckyNumber() {
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 42) + 1;
		}
		return num;
	}
}