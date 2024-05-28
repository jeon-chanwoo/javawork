package _01_lacalDateTime;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T05_DecimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 1234567.89;
		double number2 = 0.1;
		//0이면 자리차지 #이면 출력안함
		//DecimalFormat df = new DecimalFormat("0");
		System.out.println(new DecimalFormat("0").format(number));//정수 출력
		System.out.println(new DecimalFormat("#").format(number));//정수 출력
		System.out.println(new DecimalFormat("0.0").format(number2));//소수점1자리 출력
		
		
		String stNum = "1,234,567.89";
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			Number num = df.parse(stNum);
			System.out.println(num);
			double d = num.doubleValue();
			System.out.println(d*2);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	

}
