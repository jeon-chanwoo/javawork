package _02_StringMethod;

public class T03_charArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("혼자공부하는 sql");
		
		char[] chArray = {'혼','자',' ','공','부','하','는',' ','j'};
		String str2 = new String(chArray);
		System.out.println(str2);
		
		char ch1 = str.charAt(0);
		System.out.println(ch1);
	}

}
