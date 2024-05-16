package _02_overloading;


class Aaa{
	int num;
	double dou;
	String str;
	
	Aaa(){
		num =1;
		dou = 1.0;
		str = "전찬우";
	}
	Aaa(int num1){
		this.num = num1;
		dou = 1.0;
		str = "전찬우";
	}
	Aaa(int num1, double num2){
		this.num = num1;
		this.dou = num2;
		str = "전찬우";
	}
	Aaa(int num1, double num2,String name){
		this.num = num1;
		this.dou = num2;
		this.str = name;
	}
}
public class T02_main_ConOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over o1 = new Over();
		
		System.out.println(o1.add(8, 8.54));;
		System.out.println(o1.add(8, 8));;
	}

}
