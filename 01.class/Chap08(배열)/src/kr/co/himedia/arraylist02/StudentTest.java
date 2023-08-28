package kr.co.himedia.arraylist02;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentL = new Student(2023, "LEE");
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 80);
		
		studentL.showInfo();
		
		System.out.println();
		
		Student studentS = new Student(2022, "SHIN");
		studentS.addSubject("국어", 70);
		studentS.addSubject("수학", 60);
		studentS.addSubject("영어", 80);
		
		studentS.showInfo();
		
	}
}
