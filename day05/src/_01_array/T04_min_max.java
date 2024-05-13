package _01_array;

import java.util.Scanner;

public class T04_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {8,4,9,2,6,1,3,5,7};
		
		int min = score[0];
		int max = score[0];
		
		for(int i=1;i<score.length;i++) {
			if(min>score[i])
				min=score[i];
		}
		
		for(int i=1;i<score.length;i++) {
			if(max<score[i])
				max=score[i];
		}
		System.out.println("최대값 : "+max + "   최소값 : "+min);
	}
}
