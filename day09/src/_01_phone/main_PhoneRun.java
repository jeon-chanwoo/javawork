package _01_phone;

public class main_PhoneRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		API_SmartPhone sPhone1 = new API_SmartPhone("note20","white");
		System.out.println("model명 : "+ sPhone1.model);
		System.out.println("color명 : "+ sPhone1.color);
		
		sPhone1.bell();
		sPhone1.hangUp();
		sPhone1.receiveVoice("하이요");
		sPhone1.sendVoice("하이");
		sPhone1.hangOut();
		sPhone1.search("자바");
	}

}
