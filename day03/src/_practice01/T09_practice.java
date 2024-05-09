package _practice01;

import java.util.Scanner;

public class T09_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국영수 점수를 받아 합계와 평균 합격여부를 구하시오
		Scanner sc1 = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오");
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = sc1.nextInt();	
		System.out.println("두번째 정수를 입력하세요");
		int num2 = sc1.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int num3 = sc1.nextInt();
		if(num1>num2)
			System.out.println(num3 > num1 || num3<num2 ?  "true":"false");
		else if(num1<num2)
			System.out.println(num3 > num2 || num3<num1 ?  "true":"false");
	}

}

