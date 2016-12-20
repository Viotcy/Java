package ch05hw;

public class RandomNum {

	public static void main(String[] args) {
		int num[] = new int[7];
		for (int i = 1; i <= 6; i++) { // 取6次亂數
			num[i] = (int) (Math.random() * 42) + 1; // 範圍從1~42
			for (int y = 1; y < i; y++) { // 檢查是否出現重複值
				if (num[i] == num[i - y]) {
					i = i - 1; // 重複則跳回上一個元素
				}
			}
		}
		for (int t = 1; t < 7; t++) { // 印出最後結果
			System.out.println(num[t]);
		}

	}

}
