package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1이상의 숫자를 입력해 주세요");
		Scanner sc1 = new Scanner(System.in);
		int i = 1;
		int j = 2;
		while(i<=9) {
			while(j<=5) {
				System.out.printf("%d * %d = %d \t",j,i,i*j);
				j++;
				if(j==6) {
					System.out.printf("\n");
					j=2;
					break;
				}
			}
			i++;
		}
		
		j=5;
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d * %d = %d \t",j,i,i*j);
				j++;
				if(j==10) {
					System.out.printf("\n");
					j=5;
					break;
				}
			}
			i++;
		}
		
			
	}

}
