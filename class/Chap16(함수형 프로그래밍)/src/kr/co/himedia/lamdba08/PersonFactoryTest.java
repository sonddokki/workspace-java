package kr.co.himedia.lamdba08;

public class PersonFactoryTest {
	
	public static void main(String[] args) {
		
		PersonFactory personFactory = Person::new;
		Person person = personFactory.create("이순신", 40);
		
		System.out.println(person);
		
		// 익명 클래스 사용 (이전 방법)
		PersonFactory personFactory2 = new PersonFactory() {
			
			@Override
			public Person create(String name, int age) {
				return new Person(name, age);
			}
		};
		
		Person person2 = personFactory2.create("신사임당", 30);
		System.out.println(person2);
		
		// 람다 표현식 사용
		
		PersonFactory personFactory3 = (name, age) -> new Person(name, age);
		Person person3 = personFactory3.create("사도세자", 20);
		System.out.println(person3);
		
	}

}
