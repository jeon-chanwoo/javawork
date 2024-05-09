package _02_conditional;

import java.util.Scanner;

public class T03_else_if {
	public static void main(String[] args) {

		/*
		 * int num1 = 100; if(num1 ==100) System.out.println("100입니다.");
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		int num1 = sc1.nextInt();
		if(num1<0 || num1>100)
			System.out.println("잘못입력하셨습니다.");
		else if(num1 >= 90) 
			System.out.println("당신의 학점은 A 입니다.");
		else if(num1>=80)
			System.out.println("당신의 학점은 B 입니다.");
		else if(num1>=70)
			System.out.println("당신의 학점은 C 입니다.");
		else if(num1>=60)
			System.out.println("당신의 학점은 D 입니다.");
		else
			System.out.println("당신의 학점은 F 입니다.");
	}
}

