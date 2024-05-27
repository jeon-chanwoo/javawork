package _03_calender_date;

import java.util.Calendar;

public class T03_calendar_oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calender : 추상클래스 /객체를 생성할수 없음/ 메소드를 이용함

		Calendar date1 = Calendar.getInstance();
		
		date1.add(Calendar.DATE, 100);
		System.out.println((date1.get(Calendar.MONTH)+1)+"월"+date1.get(Calendar.DATE)+"일");
	}

}
