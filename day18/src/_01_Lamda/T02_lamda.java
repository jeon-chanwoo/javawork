package _01_Lamda;

public class T02_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOneArgs02 mo = new MyOneArgs02() {
		@Override
		public void method(int x) {
			int result = x*2;
			System.out.println(result);
		}
		};
		mo.method(4);
		
		mo = (x)->{
			int result = x*2;
			System.out.println(result);
		};
		mo.method(4);
	}	

}
