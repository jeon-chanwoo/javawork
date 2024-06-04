package _01_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 람다식 사용할 때 사용하는 인터페이스
		// 추상 메서드로 구현
		// 추상 메서드는 방드시 1개만 있어야 함

		MyMethod mm1 = new MyMethod() {
			@Override
			public void method() {
				System.out.println("sdfsfs");

			}
		};
		mm1.method();
		
		mm1 = () ->{
			System.out.println("람다출력");
		};
		mm1.method();
	}
}
