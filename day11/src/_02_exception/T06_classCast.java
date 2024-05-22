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

		
		/*try {
			Animal ani=new Animal();
			
			Dog dog = new Dog();
			Cat cat = new Cat();
			Animal ani1 = dog;
			Animal ani2 = cat;
			
			dog = (Dog)ani;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
		
		/*Dog dog = new Dog();
		dog d = change(dog);
		if(d == null) {
			System.out.println("변경불가");
		}else {
			d = change(dog)
		}*/
	}
	//static이 없으면 객체 생성을 해줘야 한다.
	public static void change(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal;
		}else {
			System.out.println("변경불가");
		}
	}

}
