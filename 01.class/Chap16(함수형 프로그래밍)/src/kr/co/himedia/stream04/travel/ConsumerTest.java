package kr.co.himedia.stream04.travel;

import java.util.ArrayList;
import java.util.List;

import kr.co.himedia.stream04.model.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		// 컨슈머 타입의 객체 생성
		Consumer consumerL = new Consumer("이병헌", 40,100);
		Consumer consumerN = new Consumer("전지현", 20,100);
		Consumer consumerG = new Consumer("권혁수", 13,50);
		
		// 리스트타입의 객체 생성
		List<Consumer> consumerList = new ArrayList<>();
		// 위에 생성한것들 넣어주기 add
		consumerList.add(consumerL);
		consumerList.add(consumerN);
		consumerList.add(consumerG);
		
		// 고객 명단을 출력하시오
		System.out.println("== 고객 명단 추가 순서대로 출력 ==");
		//위에서 생성한 컨슈머리스트.스트림연산.데이터를 겟 이름으로 변환. 정렬해서 출력반환
		consumerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		
		// 여행 총 비용을 계산하시오.
		
		// 여기에 대입 = 위에서 생성한 컨슈머리스트.스트림연산.데이터를 겟 여행비용으로 변환. 레디우스 (정수 합산)
		int conSum = consumerList.stream().map(n -> n.getPrice()).reduce(0,Integer::sum);
		System.out.println("여행 비용의 총 합 : "+conSum+"만원");
		
		// 여기에 대입 = 위에서 생성한 컨슈머리스트.스트림연산.맵투인트로 프라이스가져와서 변환.합산
		int total = consumerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("여행 비용의 총 합 : "+total+"만원 // 선생님버전");
		
		System.out.println();
		
		// 고객 중 20세 이상인 사람의 이름을 정렬하여 출력하시오. 
		System.out.println("== 20세 이상인 사람의 이름 정렬하여 출력 ==");
		// 컨슈머리스트.스트림연산.필터로 나이거르기.맵으로 이름가져와서 변환.정렬하기.출력하기
		consumerList.stream().filter(c -> c.getAge() >= 20 ).map(s -> s.getName()).sorted().forEach(d -> System.out.println(d));
		
		
		
		
		
	}

}
