package _03_wildcardGernerics;

public class Course {
	//모든 사람
	static void registerCourse(Applicent<?> a) {
		System.out.println(a.kind.getClass().getSimpleName());
	}
	//학생
	static void registerCourse2(Applicent<? extends Student> a) {
		System.out.println(a.kind.getClass().getSimpleName());
	}
	//직장인 일반인
	static void registerCourse3(Applicent<? super Worker> a) {
		System.out.println(a.kind.getClass().getSimpleName());
	}
	
}
