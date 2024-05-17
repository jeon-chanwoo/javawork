package _03_bank;

public class T01_main_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_bank bank = new T01_api_bank();
		bank.setDeposit(1000);
		System.out.println("잔액 : "+bank.getBalance());
		
		bank.witdraw(500);
		System.out.println("잔액 : "+bank.getBalance());
		
		bank.witdraw(800);
	}

}
