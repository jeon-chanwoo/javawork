package _practice01;

import java.util.Scanner;

public class T03_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num1 = sc1.nextInt();
		System.out.println(num1%2==0 ? "짝수다":"홀수다.");
		
	}

}
