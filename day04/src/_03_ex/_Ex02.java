package _03_ex;

public class _Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum=0;
		int oddSum=0;
		for(int i = 1; i<=100;i++) {
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
		}
		
		System.out.println( "짝수의 합계는 "+evenSum);
		System.out.println( "짝수의 합계는 "+oddSum);
	}

}
