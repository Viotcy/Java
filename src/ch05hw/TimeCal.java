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
			System.out.println("請輸入年,月,日");

			if (scan.hasNextDouble()) { // 取得輸入的日期
				y = (int) scan.nextDouble();
			}
			if (scan.hasNextDouble()) {
				m = (int) scan.nextDouble();
			}
			if (scan.hasNextDouble()) {
				d = (int) scan.nextDouble();
			}

			if (gc.isLeapYear((int) y)) { // 判斷是否為閏年
				days[2] += 1;
			}

			if (y >= 1 && m >= 1 && m <= 12 && d >= 1 && d <= 31 && d <= days[m] ) {
				// 判斷輸入資料是否範圍內的整數
				for (int i = 1; i < m; i++) { // 進行完整月份的加總
					total += days[i];
				}

				total += d; // 加上該月已過天數

				System.out.println((int) y + "年" + (int) m + "月" + (int) d + "日為該年的第" + total + "天");
				break;
			} else {
				System.out.println("輸入有誤");

			}

		}
	}
}
