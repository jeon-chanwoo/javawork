package _01_polymorphosm;

public class PetRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		Frog f = new Frog();
		
		System.out.println(d.info());
		System.out.println(d.toString());
		d.sound();
		d.pattern();
		System.out.println(c.info());
		System.out.println(c.toString());
		c.sound();
		c.pattern();
		System.out.println(f.info());
		System.out.println(f.toString());
		f.sound();
		f.pattern();
		
	}

}
