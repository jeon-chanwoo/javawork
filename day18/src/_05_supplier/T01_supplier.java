package _05_supplier;

import java.util.function.*;

public class T01_supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> sup = () -> "aaa";
		System.out.println(sup.get());
		
		IntSupplier isup = ()->5;
		IntSupplier isup2 = () -> (int)(Math.random()*45+1);
		System.out.println(isup2.getAsInt());
		
		BooleanSupplier bsup = ()->5>6;
		System.out.println(bsup.getAsBoolean());
	}

}