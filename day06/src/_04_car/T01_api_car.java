package _04_car;

public class T01_api_car {
	String company = "현대";// 회사
	String model = "티코";// 모델
	String color = "노랑";// 차색
	int Speed; // 기본값 : 0
	boolean power;// 기본값 :false

	// 시동끄고 켜기
	void power() {
		power = !power;
		if (power == true) {
			System.out.println("시동을 켭니다.");
		} else {
			System.out.println("시동을 끕니다.");
		}
	}

	// 스피드 올리기
	int speedUp() {
		if (Speed < 100)
			Speed += 10;
		return Speed;
	}

	// 스피드 내리기
	int speedDown() {
		if (Speed > 0)
			Speed -= 10;
		return Speed;
	}
}
