package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일치하는거 위치반환
		String str = "javaprogram java awsjava dajava";
		String str2 = str.replace("java", "자바");
		System.out.println(str2);
		String str3 = str.replace("자바", "Java");
		System.out.println(str3);
		
		// []안에 있는 문자들을 전부 변환시켜줍니다. 
		str2 = str.replaceAll("[arw]", "9");
		System.out.println(str2);
		
		//replace first
		
	}

}
