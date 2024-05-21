package _03_abstract;

public class SmartPhone extends Phone {

	SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("옆으로 밀어서 전화를 받습니다.");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("종료 버튼을 눌러 전화를 끊습니다.");
	}

	void search(String search) {
		System.out.println(search+"검색.");
	}
}
