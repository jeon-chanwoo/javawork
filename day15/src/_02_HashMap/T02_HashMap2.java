package _02_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "1231");
		map.put("id2", "123");
		map.put("id3", "1223");

		Scanner sc1 = new Scanner(System.in);
		

		Loop: while (true) {
			String str1 = sc1.next();
			if (map.containsKey(str1)) {
				
				System.out.println("아이디가 있습니다. 비밀번호를 입력해 주세요");
				String str2 = sc1.next();
				if (map.get(str1).equals(str2)) {
					System.out.println("아이디와 비밀번호가 맞았습니다. 종료합니다.");
					break Loop;
				} else {
					System.out.println("비밀번호가 맞지 않습니다.처음으로 이동");
					continue Loop;
				}
			} else {
				System.out.println("아이디 없다");
				continue Loop;
			}
		}
	}
}
