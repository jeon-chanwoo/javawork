package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T03_array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		int[] arrayInt = new int[num1];
		for(int i = 0; i<num1;i++) {
			arrayInt[i]=i+1;
		}
		System.out.print(Arrays.toString(arrayInt));
	}

}
