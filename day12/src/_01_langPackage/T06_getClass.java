package _01_langPackage;

class Card2{
	String Kind;
	int num;
	Card2(){
		this("asdf",231);
	}
	Card2(String kind, int num){
		this.Kind = kind;
		this.num = num;
	}
	//많이 사용함
	public String toString() {
		return "" + Kind +", "+ num;
	}
	
}
public class T06_getClass {

	public static void main(String[] args) {
		
		Card2 card1 = new Card2("SPACE",3);
		Class cardClass1 = card1.getClass();
		System.out.println(card1);
		System.out.println(cardClass1);
		System.out.println(cardClass1.getName());
	}

}
