package kr.co.himedia.dto;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "이순신";
		person.age = 30;
		person.phone = "010-1234-6789";
		person.play();
		person.eat();
		person.walk();
		System.out.println(person.toString());
		
		Person person2 = new Person();
		person2.name = "신사임당";
		person2.age = 50;
		person2.phone = "010-2312-3454";
		person2.play();
		person2.eat();
		person2.walk();
		System.out.println(person2);
		
		Person scan = new Person();
		scan.name = "홍길동";
		scan.age = 20;
		scan.phone = "010-2223-5254";
		scan.play();
		scan.eat();
		scan.walk();
		System.out.println(scan);
		
	}

}
