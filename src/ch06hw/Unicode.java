package ch06hw;

//�r����Unicode

public class Unicode {

	public static void main(String[] args) {
		Unicodetrurn uni = new Unicodetrurn();
		System.out.println(uni.toUnicodeString("�i�g��"));
	}

}

class Unicodetrurn {
	public String toUnicodeString(String s) { // �r����r���A�নUnicode
		char[] temp = s.toCharArray();
		StringBuilder un = new StringBuilder();
		for (char t : temp) {
			un.append(charToUnicode(t));// �b�쪫����ݥ[�W�Ѽ�
		}
		return un.toString();
	}

	public String charToUnicode(char c) {     //�r����Unicode
		int i = c;
		String temp = Integer.toHexString(i);
		StringBuilder un = new StringBuilder(temp);
		while (un.length() < 4) {
			un.insert(0, 0);  //�b�r��0����m���J0
		}
		un.insert(0, "\\u"); //�b�r��0����m���J"\\u"
		return un.toString();
	}
}