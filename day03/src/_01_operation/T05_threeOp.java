package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항 연산자 : 조건식 ? 조건이 참일 때 실행 : 조건이 거짓일 때 실행;
		
		Scanner sc1 = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 50;
		
		String re = num1 < num2 ? "num2 큼" : "num1 큼";
		System.out.println(re);
		
		int num3 = -8;
		System.out.println(num3 < 0 ?  num3=-num3:num3);
		System.out.println("점수입력");
		int score = sc1.nextInt();
		System.out.println(score>=80 ? "합격":"불합격");
		
	}

}
