package ch05hw;

public class RandomNum {

	public static void main(String[] args) {
		int num[] = new int[7];
		for (int i = 1; i <= 6; i++) { // ��6���ü�
			num[i] = (int) (Math.random() * 42) + 1; // �d��q1~42
			for (int y = 1; y < i; y++) { // �ˬd�O�_�X�{���ƭ�
				if (num[i] == num[i - y]) {
					i = i - 1; // ���ƫh���^�W�@�Ӥ���
				}
			}
		}
		for (int t = 1; t < 7; t++) { // �L�X�̫ᵲ�G
			System.out.println(num[t]);
		}

	}

}
