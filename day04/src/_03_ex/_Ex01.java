package _03_ex;

public class _Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = 1; i<=100;i++) {
			if(i%5==0)
				sum+=i;
		}
		
		System.out.println("5의 배수의 합계는 "+sum);
	}

}
