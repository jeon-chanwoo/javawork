package _05_Thread;

class ThreadA extends Thread {
	boolean stop = false;// 스레드 종료
	boolean work = true;// yield메소드를 호출한 시점을 알기 위해

	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("threada 작업내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("쓰레드 종료");
	}
}

class ThreadB extends Thread {
	boolean stop = false;// 스레드 종료
	boolean work = true;// yield메소드를 호출한 시점을 알기 위해

	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("threadb 작업내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("쓰레드 종료");
	}
}

public class T09_yieldThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		ta.work = false;

		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		tb.work = false;
	}
}