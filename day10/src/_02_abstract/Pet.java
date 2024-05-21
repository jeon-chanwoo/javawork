package _02_abstract;

abstract public class Pet {
	private
		String kind;
		String color;
		
	
	Pet(String kind, String color){
		this.kind=kind;
		this.color=color;
	}
	
	abstract void sound() ;
	void pattern() {
	}
	String getKind(){
		return this.kind;
	}
	String getColor() {
		return this.color;
	}
	public String toString(){
		//종류 : 포유류, 생상, 흰색
		return info();
	}
	String info() {
		//종류 포유류, 색상, 흰색
		return "종류 : "+this.kind+"색상 : "+this.color;
	}
}
