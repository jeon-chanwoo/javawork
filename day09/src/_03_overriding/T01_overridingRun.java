package _03_overriding;

class Over {
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class OverChild extends Over {
	void show(String abd) {
		System.out.println("자식클래스 메소드 : " + abd);
	}
}

public class T01_overridingRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverChild oChild = new OverChild();
		oChild.show("sdfsf");
		Over over = new Over();
		over.show("sfffdsfs");
	}

}
