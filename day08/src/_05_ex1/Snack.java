package _05_ex1;

public class Snack {
	private String kind, name, flavor;
	int numOf, price;

	public void setter(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String getter() {
		System.out.println(this.kind+"("+this.name+" - "+this.flavor+") "+this.numOf+"개"+this.price+"원");
		return null;
	}
	Snack() {
	}

	Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	String information() {

		return this.kind+this.name+this.flavor+this.numOf+this.price;
	}
}
