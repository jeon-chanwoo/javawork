package _03_Tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class T03_TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("a", 1000);
		treeMap.put("b", 2000);
		treeMap.put("c", 3000);
		treeMap.put("d", 4000);
		treeMap.put("e", 5000);
		treeMap.put("f", 6000);
		treeMap.put("g", 7000);
		treeMap.put("h", 8000);
		treeMap.put("i", 9000);
		treeMap.put("j", 10000);
		treeMap.put("k", 11000);
		
		System.out.println("단어검색 a~k");
		NavigableMap<String, Integer> raviMap = treeMap.subMap("a",true,"k", true);
		for(Entry<String, Integer>entry : raviMap.entrySet())
			System.out.println(entry.getKey()+"-"+entry.getValue());

	}

}
