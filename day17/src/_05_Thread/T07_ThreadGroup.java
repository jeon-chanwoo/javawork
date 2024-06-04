package _05_Thread;

import java.awt.Toolkit;

public class T07_ThreadGroup {
	static long start = 0;

	public static void main(String[] args) {
		ThreadGroup th = Thread.currentThread().getThreadGroup();
		System.out.println(th.getName());

		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "Group3");
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread th1 = new Thread(grp1,r,"th1");
		Thread th2 = new Thread(grp2,r,"th2");
		Thread th3 = new Thread(subGrp1,r,"th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(th.getName());
		System.out.println(th.activeGroupCount());//그룹은 3개
		System.out.println(th.activeCount());//메인까지 합쳐서 4개
		th.list();
	}
}
