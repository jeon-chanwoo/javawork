package _06_serialNo;

public class T01_api_serialNo {
	static int serialNo = 0;
	T01_api_serialNo(){
		System.out.println("시리얼 번호 : 더조은" + ++serialNo);
	}
}
