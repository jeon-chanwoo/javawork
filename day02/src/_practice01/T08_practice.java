package _practice01;

import java.util.Scanner;

public class T08_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국영수 점수를 받아 합계와 평균 합격여부를 구하시오
		Scanner sc1 = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요");
		char num = sc1.next().charAt(7);//국어	
		
		if((num=='1') || num==('3'))
			System.out.println("남자");
		else
			System.out.println("여자");
	}

}
