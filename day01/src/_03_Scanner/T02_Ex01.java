package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 구하라
		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int korean = sc1.nextInt();
		System.out.println("컴퓨터 점수를 입력하세요");
		int computer = sc1.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc1.nextInt();
		
		System.out.printf("총점 : %d\n",korean+computer+math);
		System.out.printf("평균 : %.1f",(float)(korean+computer+math)/3);
	}

}
