package _02_exception;

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String[] str = {"asdf","asdfdfe","dfsfwqfd","dfasdfsadf"};
			str[5] = "sdfeff";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
