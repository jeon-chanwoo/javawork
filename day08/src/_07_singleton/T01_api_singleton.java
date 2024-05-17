package _07_singleton;

//싱글톤 : 전체 프로그램에서 단하나의 객체만 만들도록 보장하는 기법
//		실행클래스에서 객체를 만들지 못하도록 해야함
public class T01_api_singleton {
	//인스턴스 변수=>정적 변수
	private static T01_api_singleton singleton = new T01_api_singleton();
	
	private T01_api_singleton() {
		System.out.println("객체 생성");
	}
	
	//반환형 메소드명() {}
	static T01_api_singleton Getsingleton() {
		return singleton;//정적 메소드에서는 정적 필드만 사용가능 그래서 변수 앞에 ststic붙여야됨
	}
}
