package _01_langPackage;

class Card{
	String Kind;
	int num;
	Card(){
		this("asdf",231);
	}
	Card(String kind, int num){
		this.Kind = kind;
		this.num = num;
	}
	//많이 사용함
	public String toString() {
		return "" + Kind +", "+ num;
	}
}

public class T03_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card("ssdffe",244);
		Card c3 = null;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}
