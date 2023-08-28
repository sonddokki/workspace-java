package kr.co.himedia.object02;

public class EqualsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		
		System.out.println(str1.equals(str2)); 
		// 객체가 나뉘어져 있어도 논리적으로 동일하면 트루를 반환
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 그래서 코드값이 똑같이 나옴
		
		System.out.println();
		
		Integer i1 = 100;    // new 생략해도 값 저장 가능한 생성자
		Integer i2 = 100; 
		
		System.out.println(i1.equals(i2)); 
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println();
		
		Student student1 = new Student(2023, "순신이");
		Student student2 = new Student(2023, "순신이");
		
		// 주소 값을 비교
		System.out.println(student1 == student2);
		// false가 나옴
		
		
		System.out.println(student1.equals(student2));
		// 재정의(오버라이드) 필요하여 Student 클래스에서 재정의함
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		// 해시코드도 동일하게 하기 위해 오버라이드 필요
		
		
	    System.out.println(System.identityHashCode(student1));
	    System.out.println(System.identityHashCode(student2));
	    // 아이덴티티 해시코드 호출
	    
	    System.out.println();
	    
	    student1.setStudeatName("이순신");
	    Student student3 = (Student) student1.clone();
	    // 복제

		System.out.println(student1 == student3);
		System.out.println(student1.equals(student3));
		// 
		
		System.out.println();
		
		System.out.println(student1);
		System.out.println(student3);
		
		
		
		
	}

}
