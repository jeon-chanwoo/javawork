package _01_generics;

class Box {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

class Auction{
	
}
public class T01_nonGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String)box.getObject();
		
		box.setObject(new Auction());
		Auction a= (Auction)box.getObject();
		
		
	}

}
