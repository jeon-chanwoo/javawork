package _04_ex;

public class MyException {

	void ZTO(int num1, int num2) throws UserException1 {
		if (num1 > 100 || num1 < 1 || num2 > 100 || num2 < 1) {
			throw new UserException1("범위 초과 : 1~100");
			
		} else {
			if (num1 % num2 == 0)
				System.out.println(num1 + "은" + num2 + "의 배수인가? : True");
			else
				System.out.println(num1 + "은" + num2 + "의 배수인가? : False");
		}
	}
}
