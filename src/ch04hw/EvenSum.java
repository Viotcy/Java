package ch04hw;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) { // パ1~1000
			if (i % 2 == 0) { // 耞琌案计
				sum += i;
			}
		}
		System.out.println("案计㎝=" + sum);
	}

}
