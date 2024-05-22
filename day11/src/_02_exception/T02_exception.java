package _02_exception;

public class T02_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a  =5/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류입니다");
		}
	}

}
