package _06_Function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class T02_function2 {
	static List<student> list = Arrays.asList(
			new student("홍길동", 79,100),
			new student("두번째1", 80,89),
			new student("두번째2", 33,44),
			new student("두번째3", 33,22),
			new student("두번째4", 79,88),
			new student("두번째5", 20,86)
			
			);
	
	static void printString(Function<student, String> function) {
		for(student student : list) {
			System.out.println(function.apply(student));
		}
		System.out.println();
	}
	
	
	static void printInt(ToIntFunction<student> function) {
		double num1=0;
		for(student student : list) {
			//System.out.println(function.applyAsInt(student));
			num1+=function.applyAsInt(student);
		}
		System.out.println("평균 : "+num1/list.size()+"\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생이름");
		printString(t->t.getName());
		System.out.println("영어점수");
		printInt(t->t.getEng());
		System.out.println("컴퓨터 점수");
		printInt(t->t.getCom());
	}

}
