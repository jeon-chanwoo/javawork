package _06_polymorphismEx;

public class Computer extends Product{
	Computer(){
		super(250);
	}
	@Override
	public String toString() {
		return "Conputer";
	}
}
