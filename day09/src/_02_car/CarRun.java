package _02_car;

public class CarRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmbulanceCar am1=new AmbulanceCar("엠뷸1", "삼숭", false,0);
		
		System.out.println("model : "+ am1.model);
		System.out.println("company : "+ am1.company);
		System.out.println("시동 : "+ am1.power);
		System.out.println("속도 : "+ am1.speed);
		
		am1.powerDown();
		am1.powerUp();
		am1.speedDown();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.speedUp();
		am1.carBellUp();
		am1.carBellDown();
		am1.aid();
	}

}
