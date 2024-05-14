package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T07_array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		// 문자열 입력
		int sum = 0;
		int num1 = sc1.nextInt();
		int[] idx = new int[num1];
		for (int i = 0; i < idx.length; i++) {
			idx[i] = sc1.nextInt();
		}
		System.out.println();
		for (int i = 0; i < idx.length; i++) {
			sum+=idx[i];
		}
		System.out.println(sum);
	}
}
