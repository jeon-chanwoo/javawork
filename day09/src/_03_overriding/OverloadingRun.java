package _03_overriding;

class Loading{
	void show(String str) {
		System.out.println("부모클래스 메소드 : "+str);
	}
}

class LoadingChild extends Loading{
	void show(int price) {
		System.out.println("자식클래스 메솓 : "+ price);
	}
	
	void show(String str) {
		System.out.println("자식클래스 메소드 : "+str);
	}
}
public class OverloadingRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadingChild lChild = new LoadingChild();
		lChild.show(26000);
		lChild.show("리액트");
	}

}
