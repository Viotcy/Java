package ex01;

//modifiers class classname
public class Box implements Comparable<Box> {

	// 變數型態 變數名稱 = 初值 ;
	int width;
	int depth;
	int height;
	char code;

	public Box(char code, int width, int depth, int height) {
		super();
		this.code = code;
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	public double getSurfaceArea() {
		return 2 * (width * depth + depth * height + width * height);
	}

	public double getVolume() {
	return width * depth * height;
		 
	}

	public String toString() {
		return "代號: " + code + " 體積: " + getVolume();
	}

	public int compareTo(Box o) {
		if (getVolume() > o.getVolume()) {
			return 1;
		} else if (getVolume() < o.getVolume()) {
			return -1;
		} else {
			return 0;
		}
	}
}