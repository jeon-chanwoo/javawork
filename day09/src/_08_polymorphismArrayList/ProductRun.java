package _08_polymorphismArrayList;

public class ProductRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b =new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		gameDevice gd = new gameDevice();
		b.buy(tv);
		b.buy(com);
		b.buy(gd);
		System.out.println("현재 남은돈"+b.money+"만원");
		System.out.println("현재 남은포인트"+b.bonusPoint+"포인트");
		b.info();
		b.refund(tv);
	}

}
