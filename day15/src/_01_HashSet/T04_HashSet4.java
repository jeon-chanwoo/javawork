package _01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return age == member.age && name.equals(member.name);
		}
		return false;
		
	}
}

public class T04_HashSet4 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		
		System.out.println(set.size());
		for(Member element : set) {
			System.out.println(element.name+element.age);
		}
	}
	
}
