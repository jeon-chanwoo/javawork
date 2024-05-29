package _01_HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class T03_HashSet3 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		int i = 0;
		while (set.size() < 6) {
			int rNum = (int) (Math.random() * 45) + 1;
			set.add(rNum);
		}
		System.out.println(set);

		/*set.clear();
		for (int j = 0; j < 6; j++) {
			int rNum = (int) (Math.random() * 45) + 1;
			set.add(rNum);
			
		}
		System.out.println(set);*/
		
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
