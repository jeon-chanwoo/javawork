package _01_polymorphosm;

public class Cat extends Pet{
	Cat(){
		super("요크","검정색");
	}
	Cat(String kind,String color){
		super(kind,color);
	}
	void sound(){
		System.out.println("야오오야야ㅗ야ㅗㅑ오ㅑ오ㅑㅗ야");
	}
	void pattern() {
		System.out.println("지라랄ㄹ");
	}
}
