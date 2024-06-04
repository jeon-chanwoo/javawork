package _07_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class T01_Predicate {
	static List<student> list = Arrays.asList(
			new student("홍길동", "남",100),
			new student("두번째1", "여",89),
			new student("두번째2", "남",44),
			new student("두번째3", "여",22),
			new student("두번째4", "남",88),
			new student("두번째5", "여",86)
			
			);
	static double avg(Predicate<student> predicate) {
		int sum =0, count = 0;
		for(student student : list) {
			if(predicate.test(student)) {
				sum+=student.getCom();
				count++;
			}
		}
		return (double)sum/count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mal = avg(t->t.getGen().equals("남"));
		System.out.println("남자 평균 : "+mal);
		double gir = avg(t->t.getGen().equals("여"));
		System.out.println("남자 평균 : "+gir);
	}

}
