package practice_1;

public class StringTrans {

	public static void main(String[] args) {
		String[] s = { "kITTY", "sNoopY", "MiCKY" };
		char w;

		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].toLowerCase();
			w = s[i].charAt(0);
			w = Character.toUpperCase(w);
			// s[i] = w + s[i].substring(1);
			s[i] = s[i].replace(s[i].charAt(0), w);
			System.out.println(s[i]);
		}

	}

}
