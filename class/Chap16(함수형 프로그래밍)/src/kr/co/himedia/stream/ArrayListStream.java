package kr.co.himedia.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ArrayListStream {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("스타로드");
		sList.add("말리부");
		sList.add("드렉스");
		
		// 스트림<문자열> 사용하기
		Stream<String> stream = sList.stream();
		// 그대로 반환하여 정렬하기 (람다식 (문자열에 칸띄우기))
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		
		//   스트림으로 . 가나다순으로뽑고 . 반환하기
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		//   스트림으로 . 데이터를변형 (글자수를 뽑고). 반환하기
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		
		sList.stream().filter(s -> s.length() >= 4).forEach(s -> System.out.println(s + "\t"));
		
		
	}

}
