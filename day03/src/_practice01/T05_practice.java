package _practice01;

import java.util.Scanner;

public class T05_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하나의 정수 입력받아 음수 아니면 음수가 아니다 출력
		Scanner sc1 = new Scanner(System.in);
		System.out.println("이름 입력하세요");
		String name = sc1.next();//이름	
		System.out.println("학년 입력하세요");
		int grade = sc1.nextInt();//학년
		System.out.println("반 입력하세요");
		int class1 = sc1.nextInt();//반
		System.out.println("번호 입력하세요");
		int num = sc1.nextInt();//번호
		System.out.println("성별(M/F) 입력하세요");
		String gen = sc1.next();//성별
		System.out.println("성적 입력하세요");
		double record = sc1.nextDouble();//성적
		
		if(gen.equals("M"))
			gen="남자";
		else
			gen="여자";
		
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+class1);
		System.out.println("번호 : "+num);
		System.out.println("성별 : "+gen);
		System.out.printf("성적 : %.2f\n",(float)record);
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은%.2f이다",grade,class1,num,name,gen,record);
	
	}

}
