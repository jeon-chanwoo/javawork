package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T05_array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		//문자열 입력
		String str1 = sc1.next();
		//문자 입력
		char ch1 = sc1.next().charAt(0);
		//문자열 길이
		int num2 = 0;
		int num3 = 0;
		
		for(int i=0;i<str1.length();i++) {
			num3+=1;
			if(str1.charAt(i) == ch1) {
				System.out.print(num3-1+"\t");
				num2+=1;
			}
		}
		System.out.println();
		System.out.println(num2);
	}

}
