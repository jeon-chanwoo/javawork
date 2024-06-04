package _05_Thread;

import java.awt.Toolkit;


public class T04_SingleThreadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
		System.out.println(start);
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-start);
	}
}
