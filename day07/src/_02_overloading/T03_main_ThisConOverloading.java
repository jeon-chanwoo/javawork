package _02_overloading;


class ThisAaa{
	int num;
	double dou;
	String str;
	
	ThisAaa(){
		this(1,1.0,"전찬우");
		num =1;
		dou = 1.0;
		str = "전찬우";
	}
	ThisAaa(int num1){
		this.num = num1;
		dou = 1.0;
		str = "전찬우";
	}
	ThisAaa(int num1, double num2){
		this.num = num1;
		this.dou = num2;
		str = "전찬우";
	}
	ThisAaa(int num1, double num2,String name){
		this.num = num1;
		this.dou = num2;
		this.str = name;
	}
}


public class T03_main_ThisConOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThisAaa a1= new ThisAaa();
		 ThisAaa a2= new ThisAaa(1);
		 ThisAaa a3= new ThisAaa(1,1.2);
		 ThisAaa a4= new ThisAaa(1,1.2,"ThisAaa");
		
		System.out.println(a1.dou);
		System.out.println(a2.dou);
		System.out.println(a3.dou);
		System.out.println(a4.dou);

	}

}
