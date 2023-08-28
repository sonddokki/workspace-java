package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : "+ map.size());
		
		System.out.println();
		
		map.put("서강준", 95);
		map.put("유해진", 45);
		map.put("하지원", 65);
		map.put("김슬기", 85);
		map.put("조정석", 25);
		map.put("유해진", 15);

		System.out.println("사이즈 : "+ map.size());
		System.out.println("값 : "+ map.get("유해진"));
		System.out.println(map);

		System.out.println();
		
		// map 컬렉션에 있는 key값만 Set계열로 바꿈
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key +" : "+ value);
		}
			
		System.out.println();
		
		// Map.Entry 객체를 대상으로 Set 계열로 바꿈
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
		String key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println(key+" : "+value);
		}
		
		System.out.println();
		
		// 전체 객체 삭제
		map.clear();
		System.out.println("사이즈 : " + map.size());
		
	}

}
