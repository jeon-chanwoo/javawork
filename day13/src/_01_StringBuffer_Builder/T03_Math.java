package _01_StringBuffer_Builder;

public class T03_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-11));
		System.out.println(Math.abs(-11.44));
		
		System.out.println(Math.ceil(-11.44));
		System.out.println(Math.ceil(11.44));
		
		System.out.println(Math.floor(11.44));
		System.out.println(Math.floor(-11.44));

		
		System.out.println(Math.rint(-11.44));
		System.out.println(Math.rint(11.44));
		System.out.println(Math.rint(-13.32));

		System.out.println(Math.round(-13.32));
		System.out.println(Math.round(33.32));
		
		System.out.println(Math.max(3, 8));
		System.out.println(Math.min(3, 8));
		
		double value = 12.34567;
		double value2 = value*100;
		System.out.println(value2);
		int result = (int)Math.round(value2);
		System.out.println(result);
		System.out.println(result/100.0);
		
		
		double ran = Math.random()*100;
		double ran2 = Math.round(ran);
		System.out.println(ran2/100);
		
		System.out.println(Math.pow(5,3));
		System.out.println(Math.sqrt(25));
		
		
		
		
	}

}
