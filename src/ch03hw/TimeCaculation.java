package ch03hw;

public class TimeCaculation {

	public static void main(String[] args) {
		int totalsec = 256559; // �@��256559��
		int days = 256559 / 86400; // �p�⦳�X��
		int hours = (256559 % 86400) / 1440;// �p�⦳�X�p��
		int mins = ((256559 % 86400) % 1440) / 60;// �p�⦳�X��
		int secs = (((256559 % 86400) % 1440) % 60);// �p�⦳�X��

		System.out.println("256559��=" + days + "��" + hours + "�p��" + mins + "��" + secs + "��");

	}

}
