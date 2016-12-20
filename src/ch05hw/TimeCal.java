package ch05hw;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeCal {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		Scanner scan = new Scanner(System.in);

		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y = 0, m = 0, d = 0;
		int total = 0;

		while (true) {
			System.out.println("�п�J�~,��,��");

			if (scan.hasNextDouble()) { // ���o��J�����
				y = (int) scan.nextDouble();
			}
			if (scan.hasNextDouble()) {
				m = (int) scan.nextDouble();
			}
			if (scan.hasNextDouble()) {
				d = (int) scan.nextDouble();
			}

			if (gc.isLeapYear((int) y)) { // �P�_�O�_���|�~
				days[2] += 1;
			}

			if (y >= 1 && m >= 1 && m <= 12 && d >= 1 && d <= 31 && d <= days[m] ) {
				// �P�_��J��ƬO�_�d�򤺪����
				for (int i = 1; i < m; i++) { // �i�槹�������[�`
					total += days[i];
				}

				total += d; // �[�W�Ӥ�w�L�Ѽ�

				System.out.println((int) y + "�~" + (int) m + "��" + (int) d + "�鬰�Ӧ~����" + total + "��");
				break;
			} else {
				System.out.println("��J���~");

			}

		}
	}
}
