package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		Month tomonth = null;
		Calendar ca1 = Calendar.getInstance();
		int week = ca1.get(ca1.DAY_OF_WEEK);//요일을 얻어온다.
		int month = ca1.get(ca1.MONTH);
		System.out.println(week);
		
		switch(week) {
		case 1:
			today  = Week.SUNDAY;
			break;
		case 2:
			today  = Week.MONDAY;
			break;
		case 3:
			today  = Week.TUESDAY;
			break;
		case 4:
			today  = Week.WEDNESDAY;
			break;
		case 5:
			today  = Week.THURSDAY;
			break;
		case 6:
			today  = Week.FRIDAY;
			break;
		case 7:
			today  = Week.SATURDAY;
			break;
		default:
			break;
		}
		if(today == Week.SUNDAY)
			System.out.println("그아아아아아 내일은 월요일");
		else
			System.out.println("공부해야 겠쥐?");
		
		System.out.println(month);
		
		switch(month) {
		case 1:
			tomonth  = Month.JANUARY;
			break;
		case 2:
			tomonth  = Month.FEBRUARY;
			break;
		case 3:
			tomonth  = Month.MARCH;
			break;
		case 4:
			tomonth  = Month.APRIL;
			break;
		case 5:
			tomonth  = Month.MAY;
			break;
		case 6:
			tomonth  = Month.JUNE;
			break;
		case 7:
			tomonth  = Month.JULY;
			break;
		case 8:
			tomonth  = Month.AUGUST;
			break;
		case 9:
			tomonth  = Month.SEPTEMBER;
			break;
		case 10:
			tomonth  = Month.OCTOBER;
			break;
		case 11:
			tomonth  = Month.NOVEMBER;
			break;
		case 12:
			tomonth  = Month.DECEMBER;
			break;
		default:
			break;
		}
		if(tomonth  == Month.DECEMBER)
			System.out.println("12121212121212");
		else
			System.out.println("공부해야 겠쥐?");
	}

}
