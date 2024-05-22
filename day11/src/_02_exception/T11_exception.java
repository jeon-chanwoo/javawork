package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T11_exception {

	public static void main(String[] args) {
		// run에있는 configuration을 사용하면 된다.
		int sum=0;
		try {
			int[] num = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력");
			
			for(int i =0; i<num.length;i++) {
				System.out.print(i+1+"번째 정수 입력 : ");
				num[i]= sc.nextInt();
				sum+=num[i];
				}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("모든뎨외\n"+e);
		}
		System.out.println(sum);
		
	}

}
