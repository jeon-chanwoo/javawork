package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];

		int idx = 0;
		while (true) {
			int number = (int) (Math.random() * 45) + 1;

			boolean insert = true;
			for (int i = 0; i <= idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}

			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6)
				break;
		}
		System.out.print(Arrays.toString(lotto));
		
	}

}
