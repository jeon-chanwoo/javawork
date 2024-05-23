package _01_langPackage;

class Point implements Cloneable {
	int x;
	int y;

	Point(){
		
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x+"/"+y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}

public class T04_clone {

	public static void main(String[] args) {
		Point ori = new Point(3,5);
		Point copy =(Point)ori.clone();
		
		Point ori1 = new Point();
		Point copy1 =(Point)ori1.clone();
		
		
		System.out.println(ori);
		System.out.println(copy);
		System.out.println(copy1);
		
		copy1.x = 10;
		copy1.y = 20;
		
		copy = (Point)copy1.clone();
		System.out.println(copy1);
		
	}

}
