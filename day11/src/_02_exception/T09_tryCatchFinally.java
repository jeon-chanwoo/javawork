package _02_exception;

import java.util.Scanner;

public class T09_tryCatchFinally {

	public static void main(String[] args) {
		// run에있는 configuration을 사용하면 된다.
		try {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[4]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류 : "+e);
		}
		
	}

}
