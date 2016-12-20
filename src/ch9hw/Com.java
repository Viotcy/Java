package ch9hw;

public class Com implements Comparable<Double> {
	double d = 0;

	public Com(double b) {
		this.d = b;
	}

	public int compareTo(Double o) {
		if (d > o) {
			return 1;
		} else if (d < o) {
			return -1;
		} else {
			return 0;
		}

	}
}
