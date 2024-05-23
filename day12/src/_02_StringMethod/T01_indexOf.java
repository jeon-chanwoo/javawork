package _02_StringMethod;

public class T01_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일치하는거 위치반환
		String str = "java Program";
		int index = str.indexOf("Program");
		System.out.println(index);
		
		index = str.indexOf("abc");
		System.out.println(index);
		
		if(str.indexOf("java")<0)
			System.out.println("자바 프로그래밍이 아닙니다.");
		else
			System.out.println("자바프로그램입니다");
		
	}

}
