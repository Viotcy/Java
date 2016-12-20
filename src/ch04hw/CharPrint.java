package ch04hw;

public class CharPrint {

	public static void main(String[] args) {
		String s = "Hello, World, ¤j®a¦n";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " " + (int) s.charAt(i));
		}

	}

}
