package _02_comparable;

import java.util.Comparator;

public class FruitDescending implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		if(o1.price < o2.price)
			return 1;
		else if(o1.price == o2.price)
			return 0;
		else
			return -1;
	}


}
