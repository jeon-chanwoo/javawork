package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스는 객체 생성 불가능 하다
		//형변환은 가능하다
		
		Audio au1 = new Audio();
		au1.turnOn();
		au1.turnOff();
		
		//부모 타입으로 형변환 가능
		RemoteControl rc1 = au1;
		rc1.turnOn();
		rc1.turnOff();
		
		rc1 = new Tv();
		rc1.turnOn();
		rc1.turnOff();
		
	}

}
