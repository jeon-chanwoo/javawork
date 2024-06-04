package _04_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class T01_consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = x->System.out.println(x);
		consumer.accept("java");
	
		BiConsumer<String, String> vc = (a,b)->System.out.println(a+b);
		vc.accept("자바로는" , "챗봇 못만드나");
		
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(123);
		
		ObjIntConsumer<String> oiCon = (a,b) -> System.out.println(a+b);
		oiCon.accept("이건 글자다", 11110);
	}

}
