package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T10_array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		// 문자열 입력
		int[] idx1 = new int[10];

		for (int i = 0; i < 10; i++) {
			idx1[i] = (int) (Math.random() * 9 + 1);
		}
		System.out.print(Arrays.toString(idx1));
		int max = idx1[0];
		int min = idx1[0];
		// 최대값
		for (int i = 0; i < idx1.length; i++) {
			if (max <= idx1[i]) {
				max = idx1[i];
			}
		}
		// 최소값
		for (int i = 0; i < idx1.length; i++) {
			if (min >= idx1[i]) {
				min = idx1[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
