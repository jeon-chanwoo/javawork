package _01_array;

import java.util.Scanner;

public class T02_2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 5사람의 국,수,컴,점수를 입력받고
		Scanner sc1 = new Scanner(System.in);
		int[][] score = new int[3][5];

		int num = 1;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = num;
				System.out.print(score[i][j]+"\t");
				num += 2;
			}
			System.out.println();
		}
	}
}
