package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		Scanner sc1 = new Scanner(System.in);
		
		//int num1 = sc1.nextInt();
		
		for (int i = 0; i < sc1.nextInt(); i++) {
			while (ts.size() < 6) {
				ts.add((int) (Math.random() * 45) + 1);
			}
			
			System.out.println(ts);
			ts.clear();
		}

	}

}
