package _03_wildcardGernerics;

public class T01_GernricsRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Person>(new Worker()));
		Course.registerCourse(new Applicent<Person>(new Student()));
		Course.registerCourse(new Applicent<Person>(new MiddleStudent()));
		Course.registerCourse(new Applicent<Person>(new HighStudent()));
		
		
	}

}
