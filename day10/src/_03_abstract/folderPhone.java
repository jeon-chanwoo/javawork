package _03_abstract;

public class folderPhone extends Phone {

	folderPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("폰을 열엇스비나다다다다다");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("폰을닫앗스비나다다다다");
	}

}
