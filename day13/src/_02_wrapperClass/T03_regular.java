package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-2775-8624";
		boolean result = Pattern.matches(regExp, data);
		if(result)
			System.out.println("정규식과 일치합니다.");
		else
			System.out.println("정규식과 일치하지 않습니다.");
			
	}

}
