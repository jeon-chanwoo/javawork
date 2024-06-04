package _07_Predicate;

public class student {
private String name;
private String gen;
private int com;


public student(String name, String gen, int com) {
	super();
	this.name = name;
	this.gen = gen;
	this.com = com;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGen() {
	return gen;
}
public void setGen(String gen) {
	this.gen = gen;
}
public int getCom() {
	return com;
}
public void setCom(int com) {
	this.com = com;
}

}
