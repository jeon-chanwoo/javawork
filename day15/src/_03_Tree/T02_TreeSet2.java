package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		TreeSet ts2 = new TreeSet();
		Scanner sc1 = new Scanner(System.in);
		
		while (ts2.size() < 6) {
			ts2.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(ts2);
		System.out.println("------------------------");
		int num1 = sc1.nextInt();
		
		for (int i = 0; i < num1; i++) {
			System.out.print((i+1)+"회");
			while (ts.size() < 6) {
				ts.add((int) (Math.random() * 45) + 1);
			}
			
			System.out.print(ts);
			ts.retainAll(ts2);
			System.out.println("  "+ts.size()+"개 맞췄습니다.");
			if(ts.size()==6) {
				System.out.println(ts2);
				break;
			}
			ts.clear();
		}

	}

}
