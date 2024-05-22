package _01_anonymous;

class Parent {
	String method() {
		return "부모 클래스";
	}
}

class Child extends Parent {
	@Override
	String method() {
		return "자식 클래스";
	}
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.method());

		// 클래스에 들어가는 것을 재정의 한다.
		// 익명 클래스 : 재사용할 필요가 없을 때 1번만 정의하여 사용
		Parent p2 = new Child() {
			int age = 25;
			@Override
			String method() {
				System.out.println(age);
				return "자식 클래스2";
			}
		};
		System.out.println(p2.method());
	}

}
