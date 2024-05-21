package _02_abstract;

public class Dog extends Pet{

	Dog(){
		super("불독","흰색");
	}
	Dog(String kind,String color){
		super(kind,color);
	}
	void sound(){
		System.out.println("머어멍어어머멈어어엄");
	}
	void pattern() {
		System.out.println("우직");
	}
}
