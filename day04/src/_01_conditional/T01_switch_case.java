package _01_conditional;

import java.util.Iterator;
import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		switch(num1) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("1,2 이외의 수 입니다.");
			break;
		}
	}
}
