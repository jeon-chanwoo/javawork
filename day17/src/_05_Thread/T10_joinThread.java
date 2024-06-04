package _05_Thread;

class SumThread extends Thread {
	private int sum;

	public int getNum() {
		return sum;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		System.out.println("종료");
	}
}


public class T10_joinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sumT.getNum());
	}
}