package _practice01;

import java.util.Scanner;

public class T06_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하나의 정수 입력받아 음수 아니면 음수가 아니다 출력
		Scanner sc1 = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc1.nextInt();//나이	
		if(age<=13)
			System.out.println("어린이");
		else if(age>13 && age<=19)
			System.out.println("청소년");
		else
			System.out.println("성인");
	}

}
