package _03_StakQueue;

import java.util.Stack;

class money{
	private int value;

	public money(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

public class T02_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<money>monStack = new Stack<money>();
		monStack.push(new money(1000));
		monStack.push(new money(100));
		monStack.push(new money(10));
		monStack.push(new money(2000));
		monStack.push(new money(4000));
		
		
		System.out.println(monStack.size());
		while(!monStack.isEmpty()) {
			money money = monStack.pop();
			System.out.println(money.getValue());
		}
	}

}
