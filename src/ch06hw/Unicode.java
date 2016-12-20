package ch06hw;

//字串轉Unicode

public class Unicode {

	public static void main(String[] args) {
		Unicodetrurn uni = new Unicodetrurn();
		System.out.println(uni.toUnicodeString("張君雅"));
	}

}

class Unicodetrurn {
	public String toUnicodeString(String s) { // 字串轉字元再轉成Unicode
		char[] temp = s.toCharArray();
		StringBuilder un = new StringBuilder();
		for (char t : temp) {
			un.append(charToUnicode(t));// 在原物件尾端加上參數
		}
		return un.toString();
	}

	public String charToUnicode(char c) {     //字元轉Unicode
		int i = c;
		String temp = Integer.toHexString(i);
		StringBuilder un = new StringBuilder(temp);
		while (un.length() < 4) {
			un.insert(0, 0);  //在字串0的位置插入0
		}
		un.insert(0, "\\u"); //在字串0的位置插入"\\u"
		return un.toString();
	}
}