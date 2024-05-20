package _01_phone;

public class API_Phone {
	String model;
	String color;
	

	API_Phone(String model, String color){
		this.model= model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
		
	}
	
	void hangUp() {
		System.out.println("전화를 받았습니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("나 : "+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
	
	void hangOut() {
		System.out.println("전화를 끊습니다.");
	}
}
