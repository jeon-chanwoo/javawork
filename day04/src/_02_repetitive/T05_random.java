
package _02_repetitive;

import java.util.Scanner;

public class T05_random {

	public static void main(String[] args) {
		//주사위의 숫자 맞추기 게임
		//com의 숫자는 1~6
		double rand1 = Math.random();
		int com = (int)(rand1*6+1);
		System.out.println(com);
		int user;
		Scanner sc1 = new Scanner(System.in);
		int suc = 0;
		int score = 0;
		do {
			System.out.println("주사위의 숫자를 맞춰 보세요 : ");
			user = sc1.nextInt();
			if(user == com) {
				System.out.println("맞췄습니다");
				break;
			}
			else {
				System.out.println("틀렸습니다 다시입력하세요");
				suc=1;
				score++;
			}
		}while(suc!=0);
		System.out.println(score+"회만에 맞추셨습니다5");
	}
}
