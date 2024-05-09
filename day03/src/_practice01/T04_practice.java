package _practice01;

import java.util.Scanner;

public class T04_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("사람수를 입력해주세요");
		int person = sc1.nextInt();
		System.out.println("사탕수를 입력해주세요");
		int candy = sc1.nextInt();
		System.out.println("1인당 사탕 수 : "+(candy/person));
		System.out.println("나눠주고 남은 사탕 수 : "+(candy%person));
		
	}

}
