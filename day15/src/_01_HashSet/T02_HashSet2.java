package _01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class T02_HashSet2 {

	public static void main(String[] args) {
		Object[] objArr = {"1",Integer.valueOf(1),"2","2","2","3","3","4","4","4"}; // set은 객체만 넣을 수 있기 때문에 int가 아니라 integer를 해야한다.
		Set set1 = new HashSet();
		
		for( int i = 0 ; i<objArr.length;i++) {
			set1.add(objArr[i]);
		}
		System.out.println(set1);
		//iteratorPrint(set1.iterator());
	
		set1.clear();
		System.out.println(set1);
	}
	
	
	static void iteratorPrint(Iterator<Object> i) {
		while(i.hasNext()) {
			Object ca = i.next(); 
			System.out.print(ca.toString()+" ");
		}
		System.out.println();
	}
	
}
