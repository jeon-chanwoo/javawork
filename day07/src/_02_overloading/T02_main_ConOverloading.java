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
		 Aaa a1= new Aaa();
		 Aaa a2= new Aaa(1);
		 Aaa a3= new Aaa(1,1.2);
		 Aaa a4= new Aaa(1,1.2,"aaa");
		
		System.out.println(a1.dou);
		System.out.println(a2.dou);
		System.out.println(a3.dou);
		System.out.println(a4.dou);

	}

}
