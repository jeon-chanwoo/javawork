package _03_Tree;

import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(23);
		scores.add(25);
		scores.add(78);
		scores.add(89);
		
		//>lower
		//>=floor
		//<higher
		//<=ceiling
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(scores.last()));
		System.out.println(scores.lower(scores.lower(scores.last())));
		System.out.println(scores.lower(scores.lower(scores.lower(scores.last()))));
		System.out.println(scores.lower(scores.lower(scores.lower(scores.lower(scores.last())))));
	
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println(scores.size());
		}
	}

}
