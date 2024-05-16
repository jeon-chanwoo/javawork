package _06_ex02;

public class T01_api_staff {
	int empNo;
	String empName;
	String dept;
	String job;
	int age;
	String gender;
	int salary;
	double bonusPoint;
	String phone;
	String address;
	
	T01_api_staff(){
		this.empNo=100;
		this.empName = "홍길동";
		this.dept= "영업부";
		this.job = "과장";
		this.age = 25;
		this.gender="남";
		this.salary=2500000;
		this.bonusPoint=0.05;
		this.phone="010-1234-5678";
		this.address="서울시 강남구";
		}
	T01_api_staff(String str1,String str2,String str3){
		this.empNo=100;
		this.empName = str1;
		this.dept= str2;
		this.job = str3;
		this.age = 25;
		this.gender="남";
		this.salary=2500000;
		this.bonusPoint=0.05;
		this.phone="010-1234-5678";
		this.address="서울시 강남구";
		}
	
	void Bonus() {
		 System.out.println((int)(this.salary*this.bonusPoint));
	}
	void Bonus(int num1) {
		 System.out.println((int)(num1*0.1));
	}
}
