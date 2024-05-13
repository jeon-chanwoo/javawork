package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];// 로또 번호 6자리를 넣을 배열

		int idx = 0;// 로또번호 뽑은 개수를 담을 변수

		while (true) {
			// 로또번호는 45까지 있다. 그래서 45를 곱해준 후 1을 해주면 1~45까지 나온다.
			int number = (int) (Math.random() * 45) + 1;

			boolean insert = true;// 기본적으로는 참값을 넣어 뽑은 수는 lotto에 넣는다.

			for (int i = 0; i <= idx; i++) {// 만약 lotto배열에 있는 숫자랑 같은 수가 나온경우 false값으로 불값을 바꾼다.
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}

			if (insert == true) { // insert가 참일경우 로또 배열에 수를 넣고 idx를 증가시킨다.
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6) // 만약 뽑은 수가 6개면 전체 반복문을 탈출한다.
				break;
		}
		System.out.print(Arrays.toString(lotto));

	}

}
