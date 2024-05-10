package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1이상의 숫자를 입력해 주세요");
		Scanner sc1 = new Scanner(System.in);
		/*
		 * int num1 = sc1.nextInt(); if (num1 >= 1) for (int i = 1; i <= num1; i++)
		 * System.out.println(i); else System.out.println("1이상의 숫자가 아닙니다.");
		 * 
		 * System.out.println("1~100까지의 합"); int sum = 0; for (int i = 1; i <= 100; i++)
		 * sum += i; System.out.println(sum);
		 * 
		 * System.out.println("1이상의 숫자를 입력해 주세요"); int num2 = sc1.nextInt(); for (int i
		 * = 1; i <= num2; i++) { for (int j = 1; j <= i; j++) System.out.print("*");
		 * System.out.println(); }
		 */
		for(int j = 2; j<=5;j++) 
			System.out.printf("   %d단 \t\t",j);
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 2; j<=5;j++) {
				System.out.printf("%d * %d = %d \t",j,i,i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(int j = 6; j<=9;j++) 
			System.out.printf("   %d단 \t\t",j);
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for(int j = 6; j<=9;j++) {
				System.out.printf("%d * %d = %d \t",j,i,i*j);
			}
			System.out.println();
		}
	}

}