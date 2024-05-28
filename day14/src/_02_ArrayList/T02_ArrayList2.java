package _02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList2 {

	public static void main(String[] args) {
		//제네릭을 안넣어도 사용은 가능하나 권장하지 않음
		//매게변수의 어떠한 객체라도 받는다.
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자");
		list.add(45.67);
		list.add(true);
		list.add(Integer.valueOf(7));
		list.add(new String("98"));
		
		Object obj = list.get(0);
		
		int num1 = (int)list.get(0);
		double dou = (double)list.get(2);
		int num2 = Integer.parseInt((String)list.get(2));
		System.out.println(obj);
		
	}

}
