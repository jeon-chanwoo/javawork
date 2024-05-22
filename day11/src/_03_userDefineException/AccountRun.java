package _03_userDefineException;
//같은 프로젝트의 다른 패키지의 것을 쓰려면 그냥 import
//다른 프로젝트의 다른 패키지의 것을 쓰려면 프로젝트 우클릭 속성 path 에서 project에서 설정 해줘야 한다.
//그냥 배운용도 예시
import _01_anonymous.TestMain;
import _03_bank.T01_api_bank;

public class AccountRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_bank b= new T01_api_bank();
		TestMain aa = new TestMain();
		
		
		Account bank = new Account();
		bank.setDeposit(1000);
		try {
			bank.witdraw(3000);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
