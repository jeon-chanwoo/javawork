package _08_polymorphismArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	
	ArrayList<Product> cart = new ArrayList<Product>();
	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
		return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		
		cart.add(p);
		System.out.println(p+"를 구입함");
	}
	
	void info() {
		int sum=0;
		String list ="";
		
		if(cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		
		for(int i=0;i<cart.size();i++) {
			Product p1 = cart.get(i);
			sum+=p1.price;
			list+=p1+"\n";
		}
		System.out.println(sum);
		System.out.println(list);
	}
	void refund(Product p) {
		if(cart.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+"상품이 반품되었습니다.");
		}else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}
}
