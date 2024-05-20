package _06_polymorphismEx;

public class gameDevice extends Product{
	gameDevice(){
		super(250);
	}
	@Override
	public String toString() {
		return "gameDevice";
	}
}
