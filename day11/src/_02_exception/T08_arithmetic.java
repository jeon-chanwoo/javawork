package _02_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		//사용자로부터 2수를 입력받아 나눈 몫 출력 나눈 나머지 출력
		Scanner sc1 = new Scanner(System.in);
		try {
			System.out.println("첫번째 수를 입력해 주세요");
			int num1=sc1.nextInt();
			System.out.println("두번째 수를 입력해 주세요");
			int num2 = sc1.nextInt();
			
			int num3 = num1/num2;
			int num4 = num1%num2;
			
			System.out.println(num3);
			System.out.println(num4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류입니다~");
		}
	}

}
