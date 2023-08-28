package kr.co.himedia.miniproject.school;

import java.util.ArrayList;

// 학생들을 관리하는 클래스

public class Student {
	
	// 이름, 아이디
	private String studentName;
	private int studentId;
	// 전공은 만들어둔 클래스를 정의해서 활용
	private Subject majorSubject;
	// 성적리스트는 ArrayList를 사용하여 정의
	private ArrayList<Score> scores = new ArrayList<>();
	
	public Student(String studentName, int studentId, Subject majorSubject) {
		//super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}

	// 과목에대한 점수를 add 해주는 메서드
	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
	
	
}
