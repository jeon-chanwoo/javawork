package _03_userDefineException;

public class Account {
	private int balance;

	void setDeposit(int money) {
		balance += money;
	}

	void witdraw(int money) throws UserException {
		if (balance < money) {
			throw new UserException("잔고 부족 " +(money-balance));
		} else {
			balance -= money;
		}
	}

	int getBalance() {
		return balance;
	}
}
