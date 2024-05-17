package _01_static;

public class T01_main_static {
	int a;
	static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		System.out.println(b);
		//System.out.println(a);//인스턴스 변ㅅ는 반드시 객체를 생성해야만 사용가능
		//System.out.println(c);//지역변수는 초기화를 해야함
		//클래스 변수ㅡ 클래스 메소드는 객체 생성 하지 않아도 사용가능
		System.out.println(T01_api_static.sName);
		System.out.println(T01_api_static.sMe4());
		//인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용가능
		T01_api_static s1 = new T01_api_static();
		System.out.println(s1.nameIn);
		System.out.println(s1.me2());
		System.out.println(s1.sNum);
		System.out.println(s1.sMe4());
	}

}
