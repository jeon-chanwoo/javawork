package _06_polymorphismEx;

public class ProductRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b =new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new gameDevice());
		System.out.println("현재 남은돈"+b.money+"만원");
		System.out.println("현재 남은포인트"+b.bonusPoint+"포인트");

	}

}
