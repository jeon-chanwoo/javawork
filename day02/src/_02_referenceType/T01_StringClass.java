package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String hobby = "공부하기";
		System.out.println(name==hobby);
		
		String str1 = "의료용";
		String str2 = "의료용";
		System.out.println(str1==str2);

		String myName = "홍길동";
		System.out.println(name==myName);
		
		String str3 = new String("영상");
		String str4 = new String("영상");
		String str5 = "영상";
		System.out.println(str3==str4);
		System.out.println(str3==str5);
		
		
	}

}
