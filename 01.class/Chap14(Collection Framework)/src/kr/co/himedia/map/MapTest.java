package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		// key-value 형태의 데이터를 관리하는 Map 객체 생성
		Map<String, Integer> scoreMap = new HashMap<>();
		
		// 데이터 추가
		scoreMap.put("주지훈", 98);
		scoreMap.put("박보영", 42);
		scoreMap.put("박정민", 54);
		scoreMap.put("송강호", 78);
		
		
		// 데이터 조회
		System.out.println("주지훈의 점수 : "+ scoreMap.get("주지훈"));
		System.out.println("박보영의 점수 : "+ scoreMap.get("박보영"));
		System.out.println("박정민의 점수 : "+ scoreMap.get("박정민"));
		System.out.println("송강호의 점수 : "+ scoreMap.get("송강호"));
		
		System.out.println();
		
		// 데이터 수정
		scoreMap.put("박보영", 100);
		System.out.println("박보영의 점수 : "+ scoreMap.get("박보영"));
		
		System.out.println();
		
		// 데이터 삭제
		scoreMap.remove("주지훈");
		System.out.println("주지훈의 점수 : "+ scoreMap.get("주지훈"));
		
		System.out.println("=================================");
		
		// 전체 데이터 출력
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey()+"의 점수는 : " + entry.getValue());
		}
		
	}

}
