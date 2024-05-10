package _01_conditional;

import java.util.Iterator;
import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num1 = sc1.nextInt();
		switch (num1) {
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
		System.out.println("성의 첫 단어를 입력해 주세요");
		char char1 = sc1.next().charAt(0);
		switch (char1) {
		case 'k':
			System.out.println("김씨입니다.");
			break;
		case 'l':
			System.out.println("이씨입니다.");
			break;
		case 'p':
			System.out.println("박씨입니다.");
			break;
		default:
			System.out.println("김이박 이외의 성씨입니다.");
			;
		}
		System.out.println("해당하는 달을 입력해주세요");
		int month = sc1.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("봄 입니다.");
			break;
		default:
			System.out.println("해당하는 달이 없습니다.");
			break;
		}
		
		System.out.println("연산을 해드립니다.");
		System.out.println("첫번째 수를 입력해 주세요.");
		float firnum = sc1.nextFloat();
		System.out.println("두번째 수를 입력해 주세요.");
		float secnum = sc1.nextFloat();
		System.out.println("연산자를 입력해 주세요.");
		char oper = sc1.next().charAt(0);
		switch (oper) {
		case '+':
			System.out.println(firnum+secnum+"입니다.");
			break;
		case '-':
			System.out.println(firnum-secnum+"입니다.");
			break;
		case '*':
			System.out.println(firnum*secnum+"입니다.");
			break;
		case '/':
			System.out.println(firnum/secnum+"입니다.");
			break;
		case '%':
			System.out.println(firnum%secnum+"입니다.");
			break;
		default:
			System.out.println("연산자가 아닙니다.");
			break;
		}
	}
}
