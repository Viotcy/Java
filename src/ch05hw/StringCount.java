package ch05hw;

public class StringCount {

	public static void main(String[] args) {

		String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };
		char[] w = { 'a', 'e', 'i', 'o', 'u' };

		int total = 0;

		for (int i = 0; i < ca.length; i++) {
			for (int y = 0; y < ca[i].length(); y++) {
				for (int z = 0; z < w.length; z++) {
					if (ca[i].charAt(y) == w[z]) { // 判斷母音字母個數
						total++;
					}
				}
			}
		}
		System.out.println("共有" + total + "個母音字母");
	}
}
