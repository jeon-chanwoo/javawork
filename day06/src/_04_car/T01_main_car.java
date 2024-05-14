package _04_car;

public class T01_main_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_car car1 = new T01_api_car();
		
		System.out.println("회사 : "+car1.company);
		System.out.println("모델명 : "+car1.model);
		System.out.println("컬러 : "+car1.color);
		
		
		car1.power();

		System.out.println("엑셀-현재속도 : "+car1.speedUp());
		System.out.println("엑셀-현재속도 : "+car1.speedUp());
		System.out.println("엑셀-현재속도 : "+car1.speedUp());
		System.out.println("엑셀-현재속도 : "+car1.speedUp());
		System.out.println("브레이크-현재속도 : "+car1.speedDown());
		System.out.println("브레이크-현재속도 : "+car1.speedDown());
		System.out.println("브레이크-현재속도 : "+car1.speedDown());
		System.out.println("브레이크-현재속도 : "+car1.speedDown());
		System.out.println("브레이크-현재속도 : "+car1.speedDown());
		System.out.println("컬러 변경 : 빨강");
		car1.color = "빨강";
		System.out.println("컬러 : "+car1.color);
		car1.power();
	}

}
