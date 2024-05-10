
package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		int i = 1;
		int j = 2;

		while (j <= 5) {
			System.out.printf("   %d 단 \t\t", j);
			j++;
		}
		System.out.printf("\n");
		j = 2;
		while (i <= 9) {
			while (j <= 5) {
				System.out.printf("%d * %d = %d \t", j, i, i * j);
				j++;
				if (j == 6) {
					System.out.printf("\n");
					j = 2;
					break;
				}
			}
			i++;
		}
		System.out.printf("\n");
		j = 6;
		while (j <= 9) {
			System.out.printf("   %d 단 \t\t", j);
			j++;
		}
		System.out.printf("\n");
		j = 6;
		i = 1;
		while (i <= 9) {
			while (j <= 9) {
				System.out.printf("%d * %d = %d \t", j, i, i * j);
				j++;
				if (j == 10) {
					System.out.printf("\n");
					j = 6;
					break;
				}
			}
			i++;
		}
		int num1=0;
		int num2=0;
		char oper;
		char oper1;
		// 사용자로부터 연산할 2 숫자와 연산자를 입력받아 그 결과를 출력
		while (true) {
			System.out.println("\n두 숫자를 입력하면 그 결과를 출력합니다.");
			System.out.println("종료하려면 q를 입력해 주세요.\n아니라면 q를 제외한 아무거나 입력바랍니다.");
			oper1 = sc1.next().charAt(0);
			if(oper1 == 'q') {
				System.out.println("종료됩니다.");
				break;
			}
			System.out.println("첫번째 숫자를 입력해 주세요.");
			num1 = sc1.nextInt();
			System.out.println("두번째 숫자를 입력해 주세요.");
			num2 = sc1.nextInt();
			System.out.println("연산자를 입력해 주세요.");
			while (true) {
				
				oper = sc1.next().charAt(0);
				if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%') {
					
					break;
				}
				System.out.println("다시 입력해 주세요.");
			}
			if(oper=='+')
				System.out.printf("%d %c %d = %d\n",num1,oper,num2,num1+num2);
			else if(oper=='-')
				System.out.printf("%d %c %d = %d\n",num1,oper,num2,num1-num2);
			else if(oper=='*')
				System.out.printf("%d %c %d = %d\n",num1,oper,num2,num1*num2);
			else if(oper=='/')
				System.out.printf("%d %c %d = %d\n",num1,oper,num2,num1/num2);
			else if(oper=='%')
				System.out.printf("%d %c %d = %d\n",num1,oper,num2,num1%num2);
		}
	}

}
