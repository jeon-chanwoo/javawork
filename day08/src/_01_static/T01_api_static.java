package _01_static;

public class T01_api_static {
	//인스턴스 필드
	int numIn = 3;
	String nameIn = "인스턴스";
	//정적필드
	static int sNum = 10;
	static String sName ="정저필드";
	
	//인스턴스 메소드
	void me1() {
		//인스턴스 메소드를 호출한다는 것은 이미 객체 생성되어있다.
		//인스턴스 변수, 메소드, 변소, 모두 호출 가능
		System.out.println("인스턴스 메소드 me1()");
		System.out.println(numIn);
		System.out.println(sNum);
	}
	String me2() {
		System.out.println("인스턴스 메소드me2()");
		return "me2()";
	}
	
	//정적 메소드
	
	static void sMe3() {
		//클래스에 저장 공간이 있으므로 객체를 생성하지 않고도사용가능
		//인스턴스 변수 사용 불가 인스턴스 변수는(메소드는)반드시
		//객체가 생성되어야만 사용가능 하다.
		System.out.println("정적메소드 sMe3()");
		System.out.println(sNum);
		//System.out.println(numIn);//인스턴스 변수 사용 불가
		System.out.println(sNum);
	}
	
	static String sMe4() {
		System.out.println("정적메소드 sMe4()");
		System.out.println(sName);
		return "sMe4()";
	}
}
