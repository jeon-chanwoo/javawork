package _02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//꺽쇠는 제네릭이라 한다. 
		//여러 자료형을 받을 시 클래스를 만들어 객체로 넘겨주는 것을 권장
		//()안에 배열의 개수 지정
		ArrayList<String> alist = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("String");
		list.add("data base");
		list.add(1,"1123data base");
		list.add(2,"java script");
		System.out.println("-------------------------------------");
		System.out.println(list.size());
		System.out.println(list.get(3));
		
		System.out.println("-------------------------------------");
		for(int i=0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------");
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------");
		list.remove(2);
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		list.set(2, "객체 모델링");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list.toString());
	}

}
