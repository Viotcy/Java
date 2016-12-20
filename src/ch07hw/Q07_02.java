package ch07hw;

import java.util.Calendar;

import ch03hw.Caculation;

class StaticCodeBlock {
	static String season;
}

public class Q07_02 {
	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		switch (month) {
		case 2: // 3~5��O�K��
		case 3:
		case 4:
			StaticCodeBlock.season = "Spring";
			break;
		case 5: // 6~8��O�L��
		case 6:
		case 7:
			StaticCodeBlock.season = "Summer";
			break;
		case 8: // 9~11��O���
		case 9:
		case 10:
			StaticCodeBlock.season = "Fall";
			break;
		case 11: // 12~2��O�V��
		case 0:
		case 1:
			StaticCodeBlock.season = "Winter";
			break;
		}
	}

	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);
	}

}
