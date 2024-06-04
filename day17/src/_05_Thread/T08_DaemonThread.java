package _05_Thread;

import java.awt.Toolkit;


class AutoSaveThread extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
			autoSave();
		}
	}
	void autoSave() {
		System.out.println("파일저장");
	}
}
public class T08_DaemonThread {
	

	public static void main(String[] args) {
		AutoSaveThread AST = new AutoSaveThread();
		AST.setDaemon(true);
		AST.start();
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
}
