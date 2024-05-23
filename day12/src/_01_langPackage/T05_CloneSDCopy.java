package _01_langPackage;

import java.util.Arrays;

class Point1 {
	int x;
	int y;

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "/" + y;
	}
}

class Circle implements Cloneable {
	Point1 p;
	double r;

	Circle(Point1 p, double r) {
		this.p = p;
		this.r = r;

	}

	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Circle) obj;
	}

	public Circle deepClone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Circle c = (Circle)obj;
		c.p = new Point1(this.p.x, this.p.y);
		return (Circle) obj;
	}
	@Override
	public String toString() {
		return p + "/" + r;
	}
}

public class T05_CloneSDCopy {

	public static void main(String[] args) {
		// 얕은복사
		String[] str = { "a", "b", "c" };

		String[] copyStr = str;

		str[0] = "d";

		System.out.println(str[0]);
		System.out.println(copyStr[0]);

		// 깊은복사
		String[] deepCopy = new String[5];
		for (int i = 0; i < str.length; i++) {
			deepCopy[i] = str[i];
		}
		System.out.println(Arrays.toString(deepCopy));
		str[0] = "a";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(deepCopy));

		// Array.copyOf(원본배열, 복사할 길이)<- 깊은 복사

		String[] arrayCopy = Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(arrayCopy));

		arrayCopy[2] = "z";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arrayCopy));

		Point1 p1 = new Point1(5, 10);
		Circle c1 = new Circle(p1, 3);

		Circle c2 = c1.clone();
		System.out.println(c1);
		System.out.println(c2);

		c1.r = 100.0;
		System.out.println(c1);
		System.out.println(c2);
		
		Circle c3 = c1.deepClone();
		c1.r =50.0;
		c1.p.x = 1000;
		System.out.println(c1);
		System.out.println(c3);
	}

}
