package kr.co.himedia.constructor;

public class Student {
	
	int studeantId;
	String studentName;
	int grade;
	
	public Student() {
		System.out.println("(기본생성자 호출)");
	}
	
	public Student(int studeantId, String studentName, int grade) {
		this.studeantId = studeantId; 
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은" + studeantId + "이고," + grade + "학년입니다.";
	}

}
