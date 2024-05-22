package _02_exception;

public class T03_nullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data = null;
			System.out.println(data.toString());
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류디ㅏㅅ\n"+e);
		}
	}

}
