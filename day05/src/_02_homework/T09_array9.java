package _02_homework;

import java.util.Arrays;
import java.util.Scanner;

public class T09_array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		// 문자열 입력
		boolean ch1 = true;
		String[] str1 = { "굽네", "네네", "교촌", "경아", "투존", "BBQ" };
		String str2 = sc1.next();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equals(str2)) {
				ch1 = true;
				break;
			} else {
				ch1 = false;
			}
		}
		if (ch1 == true)
			System.out.println(str2 + "치킨 배달 가능");
		else
			System.out.println(str2 + "치킨은 없는 메뉴 입니다.");
	}
}
