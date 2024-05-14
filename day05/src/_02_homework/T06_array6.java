package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T06_array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		//문자열 입력
		String[] str1 = {"월","화","수","목","금","토","일"};
		int num1 = sc1.nextInt();
		if(num1>=0 &&num1<=6) {
			System.out.println(str1[num1]+"요일");
		}else {
			System.out.println("잘못입력하셨습니다");
		}
	}
}
