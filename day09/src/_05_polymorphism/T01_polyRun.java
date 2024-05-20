package _05_polymorphism;


class A{
	int a =1;
}

class B extends A{
	int b =2;
}

class C extends A{
	int c=3;
}

class D extends B{
	int d = 4;
}

class E extends C{
	int e =5;
}
public class T01_polyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;
			
			System.out.println(b.a);
			System.out.println(b.b);
			System.out.println(a1.a);
			//System.out.println(a1.b); 오류
			
	}

}
