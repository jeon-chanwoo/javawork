package _06_Function;

public class student {
private String name;
private int eng;
private int com;

public student(String name, int eng, int com) {
	super();
	this.name = name;
	this.eng = eng;
	this.com = com;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEng() {
	return eng;
}

public void setEng(int eng) {
	this.eng = eng;
}

public int getCom() {
	return com;
}

public void setCom(int com) {
	this.com = com;
}

}
