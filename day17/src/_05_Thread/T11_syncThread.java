package _05_Thread;

class Account {
	private static int balance = 1000;

	public int getBalance() {
		return balance;
	}

	synchronized void withraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			balance-=money;
		}
	}
}

class ThreadC implements Runnable{
	private Account acc;

    public ThreadC(Account acc) {
        this.acc = acc;
    }
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money=((int)(Math.random()*3)+1)*100;
			acc.withraw(money);
			System.out.println(acc.getBalance());
		}
	}
}

public class T11_syncThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account sharedAccount = new Account();
		Thread t1 = new Thread(new ThreadC(sharedAccount));
        Thread t2 = new Thread(new ThreadC(sharedAccount));
		t1.start();
		t2.start();
	}
}