package _03_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class T01_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(0,1);
		list.addFirst(0);
		list.addLast(20);
		list.add(50);
		
		/*		System.out.println(list);
				list.remove(1);
				System.out.println(list);
				list.remove();//맨앞 노드 삭제
				System.out.println(list);
				list.removeFirst();//맨앞 노드 삭제
				System.out.println(list);
				list.removeLast();//맨앞 노드 삭제
				System.out.println(list);*/
		
		for(int i =0; i<list.size();i++) {
			list.get(i);
		}
		
		//Iterator : 리스트를 순회할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator();
		
		//hasNext() : 남아있는 객체가 있는가?
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
