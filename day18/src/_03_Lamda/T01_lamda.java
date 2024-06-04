package _03_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethod mm;
		
		mm=(x,y)->{
			int result = x+y;
			return result;
		};
		System.out.println(mm.method(4, 6));
	}

}
