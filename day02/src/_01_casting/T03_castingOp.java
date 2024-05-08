package _01_casting;

public class T03_castingOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		byte b1 = 10;
		byte b2 = 20;
		
		int result = b1+ b2;
		
		byte result2 = (byte)(b1+b2);
		
		char c1 = 'A';
		int c3 = c1 +1;
		char c2 = (char)(c1+1);
		System.out.println(c2);
		System.out.println(c3);
	
		int num1 = 100;
		int num2 = 3;
		int result3 = num1/num2;
		System.out.println(result3);
		
		double dou2 = 3;
		double result4 = num1/ dou2;
		System.out.println(result4);
		
		double re = (double)num1/num2;
		re = num1/(double)num2;
		
	}

}
