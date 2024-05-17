package _05_ex1;

public class SnackController {
	Snack Snack = new Snack();
	
	String saveData(String kind, String name,String flavor,int numOf,int price)
	{
		Snack.setter(kind, name, flavor, numOf, price);
		return null;
	}
	String confirmData() {
		
		return Snack.getter();
	}
	
	SnackController(){
		
	}
	}
