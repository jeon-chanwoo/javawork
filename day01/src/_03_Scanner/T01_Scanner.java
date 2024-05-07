package _03_Scanner;

import java.util.Scanner;

public class T01_Scanner {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();//문자열의 단어
		System.out.println("이름 입력하소");
		System.out.println(name);
		System.out.println("나이 입력하소");
		int age = sc1.nextInt();//scan 처럼 한번 할당한것은 다시 불러올 필요가 없다.
		System.out.println("키 입력하소");
		double len = sc1.nextDouble();//소수점 자리까지 받아오기 위해 double을 사용
		System.out.println("남자인가");
		boolean gender = sc1.nextBoolean();
		
		System.out.println("주소입력하시오");
		String address = sc1.nextLine();//글자수 하나만 가지고 오고싶으면 .charAt(0);<-char에서만 가능 string 안됨
		
		
	}
	
	

}
