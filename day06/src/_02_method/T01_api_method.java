package _02_method;

public class T01_api_method {
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	}
	
	int sum(int a,int b) {
		
		return a+b;
	}
	String print3() {
		
		return "아니 이게 맞아?";
	}
	void print6(String str, int z) {
		for(int i=0;i<z;i++) {
		System.out.println("입력한 문자열 : "+str);
		}
	}
}
