package practice_1;

import java.util.Scanner;

public class ScoreClass_switch {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入10的分數(介於0~100)");

		for (int i = 0; i < 10; i++) {
			if (scan.hasNextInt()) {
				score = scan.nextInt();
			}
			switch(score){
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
				a++;
				break;
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80:
				b++;
				break;
			case 79:
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70:
				c++;
				break;
			case 69:
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60:
				d++;
				break;
			default:
			    e++;
			    break;
			}
		}
		System.out.println("100~90有" + a + "人");
		System.out.println("89~80有" + b + "人");
		System.out.println("79~70有" + c + "人");
		System.out.println("69~60有" + d + "人");
		System.out.println("59~0有" + e + "人");
	}

}
