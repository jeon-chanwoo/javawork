package _practice01;

import java.util.Scanner;

public class T04_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하나의 정수 입력받아 음수 아니면 음수가 아니다 출력
		int num3=0;
		int num4=0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int num1 = sc1.nextInt();//scan 처럼 한번 할당한것은 다시 불러올 필요가 없다.
		System.out.println("사탕수를 입력하세요");
		int num2 = sc1.nextInt();//scan 처럼 한번 할당한것은 다시 불러올 필요가 없다.
		
		num3 = num2/num1;
		num4 = num2%num1;
		
		System.out.println("1인당 사탕의 수 : " + num3 + " \n남은사탕의 수 : "+num4);

	
	}

}
