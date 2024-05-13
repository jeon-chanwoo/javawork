package _01_array;

import java.util.Scanner;

public class T04_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		String[] name = new String[3];
		String[] sub = new String[6];
		float[][] score = new float[3][5];

		// 과목 입력
		for (int i = 0; i < sub.length; i++)
			sub[i] = sc1.next();
		// 이름 입력
		for (int i = 0; i < name.length; i++)
			name[i] = sc1.next();

		// 점수 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i] + "의 점수를 공백 단위로 입력해 주세요");
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc1.nextFloat();

			}
		}

		score[0][3] = score[0][0] + score[0][1] + score[0][2];
		score[1][3] = score[1][0] + score[1][1] + score[1][2];
		score[2][3] = score[2][0] + score[2][1] + score[2][2];
		score[0][4] = score[0][3] / 3;
		score[1][4] = score[1][3] / 3;
		score[2][4] = score[2][3] / 3;
		
		for (int i = 0; i < sub.length; i++)
			System.out.print(sub[i] + "\t");
		System.out.println();
		for (int j = 0; j < 3; j++) {
			System.out.print(name[j] + "\t");
			for (int k = 0; k < 5; k++) {
				System.out.print(score[j][k] + "\t");
			}
			System.out.println();
		}

	}
}
