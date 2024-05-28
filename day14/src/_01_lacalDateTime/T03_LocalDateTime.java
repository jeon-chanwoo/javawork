package _01_lacalDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime DT = LocalDateTime.now();
		System.out.println(DT);
		
		LocalDateTime startDay = LocalDateTime.of(2024, 5,7,10,5,4);
		System.out.println(startDay);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh-mm-ss");
		System.out.println(startDay.format(dtf));
		
		
		//if(today.isBefore(endDay)){
		//수업중
		//}else if (today.ifAfter(endDay){
		//수업끝
		//}else if(today.isEqual(endDay){
		//수업 끝나는 날
		
		Duration duration = Duration.between(startDay, DT);
		System.out.println(duration.toDays());
	}
	

}
