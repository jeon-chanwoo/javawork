package _01_casting;

public class T02_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동형변환	
		
		System.out.println("byte의 크기 : "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("short의 크기 : "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("int의 크기 : "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("char의 크기 : "+(int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
	
		int num1 = 123456;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		long long1 = 1111111111123456L;
		float float1 = long1;
		System.out.println(float1);
		
		int num2 = 12346;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
		
	
	}

}
