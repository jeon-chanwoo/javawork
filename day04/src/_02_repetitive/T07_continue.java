
package _02_repetitive;

import java.util.Scanner;

public class T07_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do while문은 무조건 한번 더 실행한다.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);

		int num1, num2, num3;
		num1 = num2 = num3 = 0;

		// for문에 여러 변수가 들어갈 수 있다. 하지만 조건은 1개만 가능하다.
		for (int i = 0, j = 20; i <= 10; i++, j--) {
			System.out.println(i + "       " + j);
		}

		// 중첩 for문에서 원하는 반복문을 빠져나오고 싶을 때
		fordan: for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				if (i == 5)
					break fordan;
			}
			System.out.println();
		}
	}
}
