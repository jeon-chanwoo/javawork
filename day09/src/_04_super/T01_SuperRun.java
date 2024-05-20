package _04_super;

class Parent{
	int x =10;
}

class Child extends Parent{
	int x = 20;
	void show() {
		int x = 30;
		System.out.println("x="+x);//지역->인스턴스->부모
		System.out.println("this.x="+this.x);//인스턴스->부모
		System.out.println("super.x = "+super.x);//부모
	}
}
public class T01_SuperRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch1 = new Child();
		ch1.show();
	}

}
