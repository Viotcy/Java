package ch05hw;

public class StringCount {

	public static void main(String[] args) {

		String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };
		char[] w = { 'a', 'e', 'i', 'o', 'u' };

		int total = 0;

		for (int i = 0; i < ca.length; i++) {
			for (int y = 0; y < ca[i].length(); y++) {
				for (int z = 0; z < w.length; z++) {
					if (ca[i].charAt(y) == w[z]) { // �P�_�����r���Ӽ�
						total++;
					}
				}
			}
		}
		System.out.println("�@��" + total + "�ӥ����r��");
	}
}
