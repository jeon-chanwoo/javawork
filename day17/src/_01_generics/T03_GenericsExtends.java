package _01_generics;

import java.util.ArrayList;

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Banana extends Fruit {
	public String toString() {
		return "Banana";
	}
}

class Tjoeun {
	public String toString() {
		return "Tjoeun";
	}
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

public class T03_GenericsExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Fruit> fruitBox = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> tjoeunBox = new Box2<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Banana());
		
		
		appleBox.add(new Apple());
		
		tjoeunBox.add(new Tjoeun());
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
		
	}

}
