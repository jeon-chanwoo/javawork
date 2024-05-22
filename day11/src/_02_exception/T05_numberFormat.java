package _02_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"23","17","3.1415894"};
		int i=0;
		
		try {
			for(i=0;i<str.length;i++) {
				int num = Integer.parseInt(str[i]);
				System.out.println(num);}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(i+"번째오류닷");
		}
		
		}
	
	}


