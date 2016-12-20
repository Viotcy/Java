package ch06hw;

public class MyRectangle extends Object {
	double width, depth;

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public MyRectangle() {

	}

	void setWidth(double w) {
		this.width = w;
	}

	void setDepth(double d) {
		this.depth = d;
	}

	double getArea() {
		return width * depth;
	}

	public int hashCode() {
		return (int) width ^ (int) depth;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof MyRectangle) {
			MyRectangle re = (MyRectangle) obj;
			if (this.width == re.width && this.depth == re.depth) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
