package _01_polymorphosm;

public class Frog extends Pet{
	Frog(){
		super("요크","검정색");
	}
	Frog(String kind,String color){
		super(kind,color);
	}
	void sound(){
		System.out.println("개개개액개ㅜㅐ구구구우구구ㅜ굴");
	}
	void pattern() {
		System.out.println("멍~~~~");
	}
}
