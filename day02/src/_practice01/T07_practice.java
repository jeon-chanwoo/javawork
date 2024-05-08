package _practice01;

import java.util.Scanner;

public class T07_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국영수 점수를 받아 합계와 평균 합격여부를 구하시오
		Scanner sc1 = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요\n국어 : ");
		int kor = sc1.nextInt();//국어	
		System.out.print("영어 점수를 입력하세요\n영어 : ");
		int eng = sc1.nextInt();//영어	
		System.out.print("수학 점수를 입력하세요\n수학 : ");
		int mat = sc1.nextInt();//수학	
		
		float avg = (float)(kor+eng+mat)/3;
		System.out.printf("합계 : %d\n",kor+eng+mat);
		System.out.printf("평균 : %.1f",avg);
		if((kor>=40 && eng>=40 && mat>=40) && avg>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
