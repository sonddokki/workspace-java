package kr.co.himedia.constructor03;

public class StudentTest {
	public static void main(String[] args) {
		//기본 생성자 호출
		Student student = new Student();
		System.out.println(student);
		student.getName();
		System.out.println(student.getName());
		
		System.err.println();
		
		//매개변수 2개 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		
		System.err.println();
		
		//매개변수 String형 하나 있는 생성자 호출
		Student student3 = new Student("홍길동");
		System.out.println(student3);
		
		System.err.println();
		
		//매개변수 int형 하나 있는 생성자 호출
		Student student4 = new Student(23);
		System.out.println(student4);
		
		
		
	}

}
