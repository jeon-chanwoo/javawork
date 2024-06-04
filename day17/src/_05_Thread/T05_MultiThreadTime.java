package _05_Thread;

import java.awt.Toolkit;

class MultiThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
	}
}
public class T05_MultiThreadTime {
	static long start = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread mt = new MultiThread();
		mt.start();
		start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis()-start);
		System.out.println();

	}
}
