package _05_polymorphism;


class Car{
	String color;
	int speed;
	void drive() {
		System.out.println("운전중입니다.");
	}
	void stop() {
		System.out.println("멈춤");
	}
}

class FireCar extends Car{
	void water() {
		System.out.println("물뿌리기");
	}
}
public class T03_polyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireCar fCar = new FireCar();
		fCar.water();
		fCar.drive();
		fCar.stop();
		
		Car car = fCar;
		car.drive();
		car.stop();
		FireCar fCar2 = (FireCar)car; //부모타입을 자식타입으로 강제 형변환
		//반드시 붐는 최초 객체 생성시 자식의 타입으로 객체 생성 되어 있어야함
		
		Car car2 = new Car();
		FireCar fCar3 = (FireCar)car2;
		
		
	}

}
