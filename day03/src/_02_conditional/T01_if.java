package _02_conditional;

import java.util.Scanner;

public class T01_if {
	public static void main(String[] args) {

		/*
		 * int num1 = 100; if(num1 ==100) System.out.println("100입니다.");
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		int num1 = sc1.nextInt();
		if(num1>=80) {
			System.out.println("합격입니다.");
			System.out.println("축하합니다.");
		}
		if(num1>0)
			System.out.println("양수입니다.");
		else if(num1<0)
			System.out.println("음수입니다.");
		else
			System.out.println("0입니다.");
	}
}
