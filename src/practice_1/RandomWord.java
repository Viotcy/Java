package practice_1;

public class RandomWord {

	public static void main(String[] args) {
		int[][] word = new int[5][40];
		String s = "";
		for (int i = 0; i < word.length; i++) {
			s = "";
			for (int x = 0; x < word[i].length; x++) {
				word[i][x] = (int) (Math.random() * 75) + 48;
				if ((word[i][x] >= 58 && word[i][x] <= 64) || (word[i][x] >= 91 && word[i][x] <= 96)) {
					x--;
					continue;
				} else {

					s += (char) word[i][x];
				}
			}
			System.out.println(s);
		}

	}

}
