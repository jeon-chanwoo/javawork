package _02_overloading;


class Over{
	int add() {
		return 0;
	}
	int add(int a, int b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	
	
}
public class T01_main_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over o1 = new Over();
		
		System.out.println(o1.add(8, 8.54));;
		System.out.println(o1.add(8, 8));;
	}

}
