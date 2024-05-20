package _02_car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed;
	
	Car(String model, String company, boolean power,int speed){
		this.model = model;
		this.company = company;
		this.power = power;
		this.speed = speed;
	}
	
	String powerUp() {
		if(power == false) {
			power = !power;
			System.out.println("시동이 켜졌습니다");
			return "시동이 켜졌습니다";
		}
		else {
			System.out.println("시동이 이미 켜져 있습니다");
			return "시동이 이미 켜져 있습니다.";
		}
	}
	
	String powerDown() {
		if(power == true) {
			power = !power;
			System.out.println("시동이 꺼졌습니다");
			return "시동이 꺼졌습니다";
		}
		else {
			System.out.println("시동이 이미 꺼져 있습니다.");
			return "시동이 이미 꺼져 있습니다.";
		}
	}
	
	void speedUp() {
		if(power == true && speed<100) {
			this.speed +=10; 
			System.out.println("속도가 올랐습니다. 현재 속도는 : "+this.speed);
		}
		else {
			if(power == false)
				System.out.println("시동을 먼저 켜주세요");
			if(speed==100)
				System.out.println("최고속도 입니다.");
		}
	}
	
	void speedDown() {
		if(power == true && speed>0) {
			this.speed -=10; 
			System.out.println("속도가 감소했습니다. 현재 속도는 : "+this.speed);
		}
		else {
			if(power == false)
				System.out.println("시동을 먼저 켜주세요");
			if(speed == 0 && power == true)
				System.out.println("현재 속도는 0 입니다.");
		}
	}
}
