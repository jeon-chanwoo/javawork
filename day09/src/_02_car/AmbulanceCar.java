package _02_car;

public class AmbulanceCar extends Car{

	AmbulanceCar(String model, String company, boolean power,int speed){
		super(model,  company, power,speed);
	}
	
	
	String carBellUp() {
		System.out.println("사이렌이 울립니다. 삐옹삐옹");
			return "사이렌이 울립니다. 삐옹삐옹";
	}
	String carBellDown() {
		System.out.println("사이렌이 꺼집니다.");
		return "사이렌이 꺼집니다.";
	}
	
	void aid() {
		System.out.println("응급처치 중입니다.");
	}
}
