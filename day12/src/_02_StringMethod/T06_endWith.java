package _02_StringMethod;

public class T06_endWith {

	public static void main(String[] args) {
		//맨 끝에 문자가 포함되어 있는지
		String str = "sdfsdfdsds.avi";
		boolean b = str.endsWith(".avi");
		boolean a = str.startsWith("sdf");
		System.out.println(b);
		System.out.println(a);
	}

}
