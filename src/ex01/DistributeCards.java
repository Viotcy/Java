package ex01;

public class DistributeCards {

	public static void main(String[] args) {
		String[] card[] = new String[4][13];
		String[] card1[] = new String[4][13];
		String color[] = { "Spare", "Club", "Diamond", "Heart" };

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 13; x++) {
				card[i][x] = color[i] + " " + (x + 1);
				System.out.println(card[i][x]);
			}
		}
		System.out.println("------------------------");
		System.out.println("--------分隔線----------");
		System.out.println("------------------------");
		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 13; x++) {
				int a = (int) (Math.random() * 4);
				int b = (int) (Math.random() * 13);
				if (!(card[a][b].equals("1"))) {
					card1[i][x] = card[a][b];
					card[a][b] = "1";

				} else {
					x--;
				}
			}

		}
		for (int c = 0; c < 4; c++) {
			for (int d = 0; d < 13; d++) {
				System.out.println(card1[c][d]);
			}
			System.out.println("--------分組線-----------");
		}

	}

}
