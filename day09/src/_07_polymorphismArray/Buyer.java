package _07_polymorphismArray;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	int index = 0;
	
	Product[] cart = new Product[10];
	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
		return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		
		cart[index++]=p;
		System.out.println(p+"를 구입함");
	}
	
	void info() {
		int sum=0;
		String list ="";
		
		for(int i=0;i<index;i++) {
			sum+=cart[i].price;
			list+=cart[i]+"\n";
		}
		System.out.println(sum);
		System.out.println(list);
	}
}
