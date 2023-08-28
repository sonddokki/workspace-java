package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPITest02 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// Predicate 는 boolean타입으로 반환해주는 타입  =  짝수리면 true를 반환해줌
		Predicate<Integer> isEven = n -> n%2 == 0;
		
		//                  스트림 객체생성
		int sumOfnumbers = numbers.stream()
			.filter(isEven)          // 필터로 위에 만든 Predicate타입의 변수 사용하기
			.sorted()                // 오름차순
			.map(n -> n*n)           // 데이터를 변형 (제곱인수)
			.reduce(0,Integer::sum);
		System.out.println("1~10사이의 짝수의 제곱의 합 : " + sumOfnumbers);
		
		
		
	}

}
