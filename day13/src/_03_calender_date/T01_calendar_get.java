package _03_calender_date;

import java.util.Calendar;

public class T01_calendar_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calender : 추상클래스 /객체를 생성할수 없음/ 메소드를 이용함

		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		
		int we = today.get(Calendar.DAY_OF_WEEK);
		switch (we) {
		case 1: {
			System.out.println("일요일");
			break;
		}
		case 2: {
			System.out.println("월요일");
			break;
		}
		case 3: {
			System.out.println("화요일");
			break;
		}
		case 4: {
			System.out.println("수요일");
			break;
		}
		case 5: {
			System.out.println("목요일");
			break;
		}
		case 6: {
			System.out.println("금요일");
			break;
		}
		case 7: {
			System.out.println("토요일");
			break;
		}
		default:
			break;
		}
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		if(today.get(Calendar.AM_PM)==0)
			System.out.print("오전 "+today.get(+Calendar.HOUR));
		else
			System.out.print("오후 "+today.get(+Calendar.HOUR));
	}

}
