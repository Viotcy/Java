package ch06hw;

//�H������6��1~42���ü�

public class RandomNum {
	public static void main(String[] args) {
		Luckynumber n = new Luckynumber();
		
		for (int i = 0; i < n.luckyNumber().length; i++) {
			System.out.println(n.luckyNumber()[i]);
		}
	}
}

class Luckynumber {               //�üƲ��ͪ���k
	int[] luckyNumber() {
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 42) + 1;
		}
		return num;
	}
}