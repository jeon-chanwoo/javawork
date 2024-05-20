package _05_polymorphism;


class Parent{
	void method1() {
		System.out.println("부모메소드1");
	}
	void method2() {
		System.out.println("부모메소드2");
	}

}

class Child extends Parent{
	@Override
	void method2() {
		System.out.println("자식 메소드");
	}
}
public class T02_polyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child child = new Child();
			Parent parent = child;
			parent.method1();
			parent.method2();
	}

}
