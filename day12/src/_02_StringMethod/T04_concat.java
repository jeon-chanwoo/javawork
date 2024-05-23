package _02_StringMethod;

public class T04_concat {

	public static void main(String[] args) {

		String str1 = "혼자 공부하는 ";
		String conStr = str1.concat("React");
		System.out.println(conStr);
		
		System.out.println(str1.concat("Spring"));
	}

}
