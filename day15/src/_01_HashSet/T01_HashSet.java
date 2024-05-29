package _01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class ClassA{
	String str;
	public ClassA() {}
	public ClassA(String str) {
		this.str = str;
	}
	
}

public class T01_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hst = new HashSet();//hashset
		Set set2 = new HashSet();//HashSet의 부모
		
		ClassA ca1 = new ClassA("A");//classA의 객체 생성
		set2.add(ca1);//set2에 ca1넣 넣는다.
		
		set2.add(new ClassA("asdf")); // 클래스A를 생성하여 set2에 넣는다.
		set2.add(new ClassA("asdfddd"));
		set2.add(new ClassA("asdfwwww"));
		set2.add(new ClassA("asdfqqqq"));
		
		int size = set2.size();//set2의 사이즈를 가지고 온다.
		System.out.println(size);//set2의 사이즈 출력
		/*
		//순서가 없기 때문에 for문을 쓰지않고 Iterator을 사용한다.<- 무작위로 가지고옴
		
		Iterator<ClassA> i = set2.iterator();
		System.out.print("set2 출력 : ");
		while(i.hasNext()) {
			ClassA ca = i.next(); //클래스A의 변수ca에 저장
			System.out.print(ca.str+" ");
		}
		System.out.println();
		//출력시 계속 호출이 되도록 메소드로 구현
		*/
		
		iteratorPrint(set2.iterator());//메소드 호출
		
		set2.add(new ClassA("AWS")); // 객체 추가
		
		iteratorPrint(set2.iterator());//메소드 호출
		
		//삭제 : AWS
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next();
			if(ca.str.equals("A")) // ca에 있는 str값 비교
				i.remove();// 삭제할때는 set이 아니라 iterator에서 삭제를 해준다.
		}
		iteratorPrint(set2.iterator());
	}

	//사용하고 싶을 때 사용할 수 있도록 메소드로 구현
	static void iteratorPrint(Iterator<ClassA> i) {
		while(i.hasNext()) {
			ClassA ca = i.next(); //클래스A의 변수ca에 저장
			System.out.print(ca.str+" ");
		}
		System.out.println();
	}
}
