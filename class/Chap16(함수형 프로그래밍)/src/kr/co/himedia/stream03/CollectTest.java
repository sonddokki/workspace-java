package kr.co.himedia.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 정수리스트에서 각 원소를 제곱한 값을 출력하시오.
public class CollectTest {
	
	public static void main(String[] args) {
		
		// 정수로된 리스트 넘버스에 배열 1,2,3,4,5를 대입
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		// 스트림의 각 원소를 제곱한 값으로 구성된 새로운 리스트를 생성함
		List<Integer> squaredNums = numbers.stream()               // 스트림연산시작
									.map(n -> n*n)                 // 데이터를 변형 (제곱하기)
									.collect(Collectors.toList()); // 컬렉터 투 리스트로 반환
		
		System.out.println("정수 리스트에서 각 원소를 제곱한 값 : "+ squaredNums);
		
	}

}
