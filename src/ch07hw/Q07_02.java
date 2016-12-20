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
		case 2: // 3~5月是春天
		case 3:
		case 4:
			StaticCodeBlock.season = "Spring";
			break;
		case 5: // 6~8月是夏天
		case 6:
		case 7:
			StaticCodeBlock.season = "Summer";
			break;
		case 8: // 9~11月是秋天
		case 9:
		case 10:
			StaticCodeBlock.season = "Fall";
			break;
		case 11: // 12~2月是冬天
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
