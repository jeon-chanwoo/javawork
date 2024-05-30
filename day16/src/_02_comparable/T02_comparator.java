package _02_comparable;

import java.util.Arrays;
import java.util.Comparator;

class Decending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1);
		}
		return -1;
	}
	
	
}
public class T02_comparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"cat","tiger","dog","lion"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		
	}

}
