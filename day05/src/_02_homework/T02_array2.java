package _02_homework;

import java.util.Arrays;

public class T02_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = new int[10];
		for(int i = 10; i>0;i--) {
			arrayInt[10-i]=i;
		}
		System.out.print(Arrays.toString(arrayInt));
	}

}
