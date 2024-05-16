package _06_ex02;

public class T01_main_staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_staff staff1 = new T01_api_staff();
		T01_api_staff staff2 = new T01_api_staff("홍길동","영업부","과장");
		
		System.out.println("empNo\tempName\tdept\tjob\tage\tgender\tsalary\t\tbonusPoint\t\tphone\taddress\t\tbonus");
		System.out.print(staff1.empNo+"\t"+staff1.empName+"\t"+staff1.dept+"\t"+staff1.job+"\t"+staff1.age+"\t"+staff1.gender+"\t"+staff1.salary+"\t\t"+staff1.bonusPoint+"\t\t"+staff1.phone+"\t"+staff1.address+"\t");
		staff1.Bonus();
		System.out.println();
		System.out.print(staff2.empNo+"\t"+staff2.empName+"\t"+staff2.dept+"\t"+staff2.job+"\t"+staff2.age+"\t"+staff2.gender+"\t"+staff2.salary+"\t\t"+staff2.bonusPoint+"\t\t"+staff2.phone+"\t"+staff2.address+"\t");
		staff2.Bonus(staff2.salary);	
	}

}
