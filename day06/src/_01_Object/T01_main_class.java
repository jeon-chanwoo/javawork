package _01_Object;

public class T01_main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_class ob1 = new T01_api_class();
		int result = ob1.num;
		System.out.println(result);
		System.out.println(ob1.num);
		System.out.println(ob1.name);
		ob1.name = "지성퐉";
		System.out.println(ob1.name);
		
		T02_api_class ob2 = new T02_api_class();
		System.out.println(ob2.age);
		System.out.println(ob2.address);
		ob2.address = "서울시 강동구";
		System.out.println(ob2.address);
	}

}
