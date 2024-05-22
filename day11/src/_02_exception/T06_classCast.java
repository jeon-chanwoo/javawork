package _02_exception;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class T06_classCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Animal ani=new Animal();
			
			Dog dog = new Dog();
			Cat cat = new Cat();
			Animal ani1 = dog;
			Animal ani2 = cat;
			
			dog = (Dog)ani;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
