package practice_1;

public class IsForth {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2001; i <= 2400; i++) {
			if (i % 4 == 0 && i % 100 != 0 && i % 400 != 0) {
               sum++;
			}
		}
		System.out.println("�O4�����Ƥ��O100��400�����Ʀ@��"+sum+"��");

	}

}
