package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf(" %7d 우리나라의 평균키는 %.1f입니다.\n",32000,165.7);
		System.out.printf(" %8s 우리나라의 평균키는 %.1f입니다.\n","asdfwef",165.7);
		System.out.printf(" %-8s 우리나라의 평균키는 %.1f입니다.\n","asdfwef",165.7);
		System.out.printf(" %-8s 우리나라의 평균키는 %6.1f입니다.\n","asdfwef",165.7555);
	}
}
