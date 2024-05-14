package _02_method;

public class T01_method {
	public static void main(String[] args) {
		T01_api_method ob1 = new T01_api_method();
		T02_api_method ob2 = new T02_api_method();
		
		ob1.print1();
		System.out.println(ob1.sum(5, 7));
		String str1 = ob1.print3();
		System.out.println(str1);
		ob1.print6("안녕 난 찬우야", 4);
		
		System.out.println("더하기 : "+ob2.add(1, 2));
		System.out.println("빼기 : "+ob2.sub(5, 2));
		System.out.println("곱하기 : "+ob2.mul(7, 2));
		System.out.println("나누기 : "+ob2.div(9, 2));
		System.out.println("나머지 : "+ob2.rem(7, 2));
	}
}
