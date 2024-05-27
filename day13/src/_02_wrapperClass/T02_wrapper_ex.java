package _02_wrapperClass;

public class T02_wrapper_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//valueOf() : Integer객체에서 int형 갓을 뽑아내는 메소드
		//int->언박싱->int
		//언박싱 : 참조자료형-> 기본자료형
		//박싱 : 기본자료형-> 참조자료형
		
		Integer num = Integer.valueOf(100);
		int num1 = num;
		
		Character ch = Character.valueOf('1');
		char c =ch;
		
		Integer num2 = Integer.parseInt("100");
		Integer num3 = Integer.valueOf("100");
		
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		
		
		
		
	}

}
