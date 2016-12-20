package ch9hw;

public class BoyFriend implements Comparable<BoyFriend> {
	String name;
	int annualSalary;
	double height;

	public BoyFriend(String name, int annualSalary, double height) {
		super();
		this.name = name;
		this.annualSalary = annualSalary;
		this.height = height;
	}

	public String toString() {
		return name + "  ¦~Á~:" + annualSalary + " ¨­°ª:" + height;
	}

	public int compareTo(BoyFriend o) {
		if (height > o.height) {
			return -1;
		} else if (height < o.height) {
			return 1;
		} else {
			if (annualSalary > o.annualSalary) {
				return -1;
			} else if (annualSalary < o.annualSalary) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
