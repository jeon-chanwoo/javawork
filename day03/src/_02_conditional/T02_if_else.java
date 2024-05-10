package _02_conditional;

import java.util.Scanner;

public class T02_if_else {
	public static void main(String[] args) {

		/*
		 * int num1 = 100; if(num1 ==100) System.out.println("100입니다.");
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int num1 = sc1.nextInt();
		if (num1 % 2 == 0)
			System.out.println("짝수.");
		else
			System.out.println("홀수.");
	}
}
