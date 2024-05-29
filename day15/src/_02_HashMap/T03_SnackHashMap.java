package _02_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Snack> map = new HashMap<String, Snack>();

		map.put("과자이름1", new Snack("맛1", 1));
		map.put("과자이름2", new Snack("맛2", 2));
		map.put("과자이름3", new Snack("맛3", 3));
		map.put("과자이름4", new Snack("맛4", 4));

		System.out.println(map);
		// 값이 있으면 값을 덮어쓰고 키 값이 없으면 넣는다.
		map.put("과자이름3", new Snack("맛23232", 4));
		System.out.println(map);

		// replace 키에 해당하는 값 변경 키가 없으면 아무것도 하지 않음
		map.replace("칸초", new Snack("맛4", 4));
		System.out.println(map);

		// Iterator에서 사용하려면 Map->Set->Iterator
		// 1. Mapt => Set으로 변경
		Set keySet = map.keySet();// 키를 몽땅 가지고 오는 명령어

		// 2. Set=>Iterator에 담기
		Iterator iKey = keySet.iterator();

		// 3. Iterator을 돌면서 출력
		while (iKey.hasNext()) {
			String key = (String) iKey.next();
			Snack value = map.get(key);
			System.out.println(key + value);
		}
		// EntrySet() 이용하는 방법
		//Set<Entry<String,Snack>> e = map.entrySet();
		
		Set entrySet = map.entrySet();//키+값 세트의 집합
		Iterator itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			//Entry = key+value가 있는 엔트리 타입
			String key = (String)entry.getKey();//엔트리중에서 키만 가지고옴
			Snack value = (Snack)entry.getValue();
			
		}
		
		
	}

}
