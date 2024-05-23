package _01_langPackage;

class Value{
	int value;
	
	Value(int value){
		this.value= value;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.value == ((Value)o).value;
	}
}



public class T01_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value val1 = new Value(10);
		Value val2 = new Value(10);
		Value val3 = val1;
		//오브잭트 클래스의 이퀄은 주소가 같은지를 물어본다.
		if(val1.equals(val2))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(val1.equals(val3))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
