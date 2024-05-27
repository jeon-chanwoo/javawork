package _03_calender_date;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calender : 추상클래스 /객체를 생성할수 없음/ 메소드를 이용함

		Calendar date1 = Calendar.getInstance();
		
		date1.set(2024,0,7);
		
		System.out.println("월 : "+ ((date1.get(Calendar.MONTH))+12)%13);
		
	}

}
