package _05_Thread;

import java.awt.Toolkit;

class PriorityThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<100000;i++) {
			System.out.print("*");
			for(int j=0;j<10000000;j++);
		}
	}
}

class PriorityThread2 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<100000;i++) {
			System.out.print("^");
			for(int j=0;j<10000000;j++);
		}
		System.out.println();
	}
}
public class T06_ThreadPriority {
	static long start = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread pt = new PriorityThread();
		PriorityThread2 pt2 = new PriorityThread2();
		pt.setPriority(10);
		pt2.setPriority(1);
		System.out.println(pt.getPriority());
		System.out.println(pt2.getPriority());
		pt.start();
		pt2.start();
		
		/*pt.setPriority(7);
		System.out.println(pt.getPriority());
		System.out.println(pt2.getPriority());*/
		
	}
}
