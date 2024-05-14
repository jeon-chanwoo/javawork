package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T08_array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		// 문자열 입력
		int num1 = 0;
		
		System.out.println("3이상의 홀수 를 입력하세요");
		while(true) {
			num1 = sc1.nextInt();
			if(num1<3 ||num1%2==0) {
				System.out.println("다시 입력하세요");
			}else {
				break;
			}
		}
		
		int[] idx = new int[num1];
		
		for (int i = 0; i <= idx.length/2; i++) {
			idx[i] = i+1;
		}
		for (int i = idx.length/2+1; i < idx.length; i++) {
			idx[i]=idx[i-1]-1;
		}
		System.out.print(Arrays.toString(idx));
	}
}
