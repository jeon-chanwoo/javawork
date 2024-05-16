package _05_static;

public class T01_main_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_static as1 = new T01_api_static();
		T01_api_static as2 = new T01_api_static();
		
		as1.num = 15;
		as2.num = 100;
		
		System.out.println(as1.num);
		System.out.println(as2.num);
		
		as1.sNum = 50;
		as2.sNum = 20000;
		
		System.out.println(as1.sNum);
		System.out.println(as2.sNum);
		
	}

}
