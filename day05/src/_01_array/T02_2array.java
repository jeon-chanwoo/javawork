package _01_array;

import java.util.Scanner;

public class T02_2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[2] = 20;
		
		for(int i = 0;i<5;i++)
			System.out.println(arrayInt[i]);
		
		int[] arrayInt2 = {1,2,3,4,5};
		
		for(int i = 0;i<5;i++)
			System.out.println(arrayInt2[i]);
		
		char[] arrayChar = new char[10];
		for(int i=0; i<10;i++) {
		arrayChar[i] = sc1.next().charAt(0);
		}
		
		
	}

}
