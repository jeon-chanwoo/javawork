package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		// 마지막 인덱스를 얻어오시오
		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));

		
		
		String text2 = "홍길동-아무개/이순신@강감찬";
		String[] name2 = text2.split("-|/|@");
		System.out.println(Arrays.toString(name2));
	
		
		
		String[] name3 = text.split("-",3);
		System.out.println(Arrays.toString(name3));
	}

}
