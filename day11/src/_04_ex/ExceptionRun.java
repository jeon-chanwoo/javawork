package _04_ex;

import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyException ex = new MyException();
		
		Scanner sc1 = new Scanner(System.in);
		try {
			int num1=sc1.nextInt();
			int num2=sc1.nextInt();
			try {
				ex.ZTO(num1, num2);
			} catch (UserException1 e) {
				// TODO: handle exception
				System.out.println("오류 메시지: " + e.getMessage());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자입력해!");
		}
		
		
		
		
		
	}
	
	
}
