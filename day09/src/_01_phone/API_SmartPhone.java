package _01_phone;

public class API_SmartPhone extends API_Phone{
	
	String search;
	
	//부모의 생성자에 매개변수가 있으면 자식도 반드시 생성자가 있어야 됨
	//부모 생성자의 인자값으 넘겨줘야 됨
	//이유 : 자식의 객체를 생성하면 부모의 객체도 생성됨
	API_SmartPhone(String model, String color){
		//super 부모의 생성자 호출
		super(model,color);
	}
	
	String search(String search) {
		this.search = search;
		return this.search;
	}
}
