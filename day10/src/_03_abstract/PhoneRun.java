package _03_abstract;

public class PhoneRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone fp = new folderPhone("홍길동");
		fp.turnOn();
		fp.turnOff();
		
		SmartPhone sp = new SmartPhone("이순신");
		sp.turnOn();
		sp.turnOff();
		sp.search("ㄴㅇㄹ");
	}

}
