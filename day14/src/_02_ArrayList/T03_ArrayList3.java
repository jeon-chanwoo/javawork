package _02_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T03_ArrayList3 {

	public static void main(String[] args) {
		//제네릭을 안넣어도 사용은 가능하나 권장하지 않음
		//매게변수의 어떠한 객체라도 받는다.
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			int random = (int)(Math.random()*10);
			list.add(random);
			
		}
		System.out.println(list.toString());
		
		List<Integer> list2 = new ArrayList<Integer>(list.subList(3, 6));
		System.out.println(list2.toString());
		
		Collections.sort(list);
		System.out.println(list.toString());
		
		//교집합
		System.out.println(list.containsAll(list2));
		//교집합 제외하고 다삭제
		System.out.println(list.retainAll(list2));
		System.out.println(list.toString());
		
	}

}
