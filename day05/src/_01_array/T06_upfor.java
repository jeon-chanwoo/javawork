package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_upfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1,2,3,4,5};
		for(int result : num) {
			System.out.println(result);
		}
		int[] oldScore = {98,67,48,100,94};
		int[] newScore = new int[10];
		
		System.arraycopy(oldScore, 0, newScore, 0, oldScore.length);
		System.out.print(Arrays.toString(newScore));
	}

}
