package _04_super;

class Parent3{
	int x =10;
	int z ;
	Parent3() {
		System.out.println("부모생성자 호출");
		z=10;
	}
}

class Child3 extends Parent3{
	int x;
	int y;
	Child3(){
		System.out.println("자식생성자 호출");
		y=10*10;
	}
}
class GrandChild extends Child3{
	int x;
	GrandChild(){
		System.out.println("손자생성자 호출");
		x=10*10*10;
	}
}
public class T03_SuperRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild ch1 = new GrandChild();
		System.out.println(ch1.x);
		System.out.println(ch1.y);
		System.out.println(ch1.z);
	}

}
