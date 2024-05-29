package _02_HashMap;

import java.util.HashMap;

public class T01_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("전찬우", 1);
		map.put("전찬우1", 2);
		map.put("전찬우2", 3);
		map.put("전찬우3", 4);
		map.put("전찬우4", 5);
		System.out.println(map.size());
		System.out.println(map.get("전찬우"));
		
		System.out.println(map);
		
		map.remove("전찬우");
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
	}

}
