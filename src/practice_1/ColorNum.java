package practice_1;

public class ColorNum {

	public static void main(String[] args) {
		String[] str = { "¶À¦â", "ºñ¦â", "ÂÅ¦â" };
		int i = 0, x = 0;
		while (i != -1) {
			i = (int) (Math.random() * 12) - 1;
			if (i == -1) {
				System.out.println("i = " + i);
				break;
			} else {
				System.out.println(str[x] + " " + i);
				x++;
				if (x == 3)
					x = 0;
			}
		}

	}

}
