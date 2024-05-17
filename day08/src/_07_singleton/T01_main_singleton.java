package _07_singleton;

public class T01_main_singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_singleton singleton1 = T01_api_singleton.Getsingleton();
		T01_api_singleton singleton2 = T01_api_singleton.Getsingleton();
		T01_api_singleton singleton3 = T01_api_singleton.Getsingleton();
		
		if(singleton1 == singleton2) {
			System.out.println("같은 객체를 가리키고 있음");
		}else
		{
			System.out.println("다른 객체");
		}
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
	}

}
