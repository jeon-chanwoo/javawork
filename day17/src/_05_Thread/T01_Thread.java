package _05_Thread;
class Thread1 extends Thread{
	public void run() {
		for(int i=0 ; i<5;i++) {
			System.out.println(i);
		}
	}
}
public class T01_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
	}

}
