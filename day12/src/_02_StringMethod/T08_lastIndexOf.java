package _02_StringMethod;

public class T08_lastIndexOf {

	public static void main(String[] args) {
		//마지막 인덱스를 얻어오시오
		
		String str = "abcdefgggggg";
		
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.lastIndexOf("efg",4));
		
	}

}
