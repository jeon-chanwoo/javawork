package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T12_throw {

	public static void main(String[] args) {
		// throw : run에있는 configuration을 사용하면 된다.
		// throws : 메소드를 호출하여 사용할 때 발생할 수 있는 예외를 명시해 두고 그 메소드르 사용할 때에 예외에 대한 대비를 반드시 해줘야 한다.
		try {
			Exception e = new Exception("강제로 예외발생 시킴");
			throw e;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
