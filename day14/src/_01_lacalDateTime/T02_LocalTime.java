package _01_lacalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class T02_LocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		LocalTime time2 =LocalTime.of(17,20,1);
		System.out.println(time2);
		
		
		
		
	}
	

}
