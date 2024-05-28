package _01_lacalDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());
		System.out.println(today.lengthOfMonth());
		System.out.println(today.lengthOfYear());
		System.out.println(today.isLeapYear());
		
		LocalDate day = LocalDate.of(2024, 5,7);
		System.out.println(day);
		
		
	}
	

}
