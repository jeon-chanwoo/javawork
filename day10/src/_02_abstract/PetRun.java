package _02_abstract;

public class PetRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		Frog f = new Frog();
		
		System.out.println(d.info());
		System.out.println(d);
		d.sound();
		d.pattern();
		System.out.println(c.info());
		System.out.println(c);
		c.sound();
		c.pattern();
		System.out.println(f.info());
		System.out.println(f);
		f.sound();
		f.pattern();
		
	}

}
