package _02_multiGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Tv, String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트 티비");
		
		Tv tv = p1.getKind();
		String str1 = p1.getModel();
		
		System.out.println(tv + str1);
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("2024");
		
		Car kindCar = p2.getKind();
		String modelCar = p2.getModel();
		
		System.out.println(kindCar+modelCar);
	}

}
