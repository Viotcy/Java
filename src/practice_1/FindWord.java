package practice_1;

public class FindWord {

	public static void main(String[] args) {
		String s = "������B�L���B�Ŧ�B���A������";
		int[] index = new int[6];
		int all = s.length();  //all�����}�C����

		while (s.indexOf("��") != -1) {
			int i = 0;
			index[i] = s.indexOf("��") + (all - s.length()); //"�⪺��m"����ثe��m�[�W����Ӽ�
			s = s.substring(s.indexOf("��") + 1);  //�h���w��X�Ӫ���
			System.out.println("��" + (i + 1) + "��b�r���" + index[i] + "��");
			i++;
		}

	}

}
