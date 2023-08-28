package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
	
	public static void main(String[] args) {
		
		// 넘버스 배열 생성   = 1,2,3,4,5 대입
		int[] numbers = {1,2,3,4,5};
		
		// even 변수 0으로 대입
		int even = 0;
		
		// 넘버스 수만큼 꺼내와서
		for (int num : numbers) {
			// 그중에 짝수가있으면
			if (num % 2 == 0) {
				// even에 더해서 대입
				even += num;
			}
		}
		
		System.out.println("even = "+even);
		System.out.println();
		
		// 스트림 객체생성 = 배열객체에 스트림(넘버스넣기)
		IntStream stream = Arrays.stream(numbers);
		
		
		int sumOfEven = Arrays.stream(numbers)
						.filter(n -> n%2 == 0)
						.sum();

		System.out.println("sumOfEven = "+sumOfEven);
		System.out.println();
		
		
		Arrays.stream(numbers).filter(n -> n%2 == 0).forEach(s -> System.out.println("even = " + s));
		
		
		System.out.println();
		
		
		int[] evenBumber = Arrays.stream(numbers)
						   .filter(n->n%2==0)
						   .toArray();
		
		for(int even0 : evenBumber)
			System.out.println("even = " + even0);
		
		
	}

}
