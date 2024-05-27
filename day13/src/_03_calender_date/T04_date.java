package _03_calender_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calender : 추상클래스 /객체를 생성할수 없음/ 메소드를 이용함

		Date now=new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(now));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf2.format(now));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf3.format(now));
	}

}
