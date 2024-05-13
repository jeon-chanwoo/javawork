package _02_homework;

import java.util.Arrays;

public class T01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = new int[10];
		for(int i = 0; i<10;i++) {
			arrayInt[i]=i+1;
		}
		System.out.print(Arrays.toString(arrayInt));
	}

}
