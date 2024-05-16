package _04_inheritance;
class A{
	int aa = 10;
}
class B extends A{
	int bb = 200;
}
class C extends A{
	int cc = 5000;
}
class D extends C{
	int dd = 30000;
}
public class T01_main_inheritance {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.aa);
		
		B b1 = new B();
		System.out.println(b1.aa+"   "+b1.bb);
	
		C c1 = new C();
		System.out.println(c1.aa+"   "+c1.cc);
	
		D d1 = new D();
		System.out.println(d1.dd+"   "+d1.aa+"   "+d1.cc);
	}
}
