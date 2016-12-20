package practice_1;

public class SquareCube {

	public static void main(String[] args) {
		int i = 1;
		while (i != 101) {
			if (i % 5 == 0) {
				i++;
				continue;
			} else {
				System.out.println(i + "キよ = " + (i * i) + " ミよ = " + (i * i * i));
				i++;
			}
		}

	}

}
