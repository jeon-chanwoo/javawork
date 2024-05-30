package _02_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class T03_FruitComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		treeSet.add(new Fruit("과일1",1111));
		treeSet.add(new Fruit("과일2",2222));
		treeSet.add(new Fruit("과일3",3333));
		treeSet.add(new Fruit("과일4",4444));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + fruit.price);
		}
	}

}
