package practice_1;

public class RanNumSum {

	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (i != -1) {
			i = (int) (Math.random() * 12) - 1;
			System.out.println(i);
			if (i == -1) {
				break;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
