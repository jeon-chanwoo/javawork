package _practice01;

import java.util.Scanner;

public class T01_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하나의 정수 입력받아 음수 아니면 음수가 아니다 출력
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num1 = sc1.nextInt();//scan 처럼 한번 할당한것은 다시 불러올 필요가 없다.
		if(num1>0) {
			System.out.println("음수가 아니다.");
		}
		else
			System.out.println("음수");
	}

}
