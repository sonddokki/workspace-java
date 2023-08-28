package kr.co.himedia.miniproject.ui;

import java.nio.Buffer;
import java.util.ArrayList;

import kr.co.himedia.miniproject.school.School;
import kr.co.himedia.miniproject.school.Score;
import kr.co.himedia.miniproject.school.Student;
import kr.co.himedia.miniproject.school.Subject;
import kr.co.himedia.miniproject.school.view.GenerateGradeDisplay;
import kr.co.himedia.miniproject.utils.Constant;


import kr.co.himedia.miniproject.school.School;

/*
 *  1. 요구사항 정의
 *  
 *  	Himedia 아카데미가 있습니다.
 *   
 *   	이 아카데미에는 5명의 학생들이 수업을 듣습니다.
 *                            ----
 *   	과목은 국어와 수학이 있고, 각 학생은 두 과목을 모두 수강합니다.
 *      ----
 * 		전공은 국어교육학과와 컴퓨터공학 두가지 있습니다.
 * 		국어 교육학과는 국어가 필수과목이고, 컴퓨터공학은 수학이 필수과목입니다.
 * 
 * 		이번학기 설정이 아래와 같이 나왔습니다.
 * 
 *      ------------------------------------------------------------------------------------
 *      이름          학번           전공           필수과목        국어점수        수학점수
 *      ------------------------------------------------------------------------------------
 *      스티브잡수    20230807       국어교육학과   국어             95              56
 *      이순신        20230808       컴퓨터공학과   수학             94              98
 *      리누스토발즈  20230809       국어교육학과   국어             100             88
 *      제임스고슬링  20230810       국어교육학과   국어             89              94
 *      이도          20230811       컴퓨터공학과   수학             83              56
 *      
 *      학점을 부여하는 방법은 여러가지가 있습니다.
 *      단순히 A ~ F을 부여하는 방법, S ~ F을 부여하는 방법이 있습니다.
 *      
 *      일반과목이라면 A ~ F로, 필수과목이라면 S ~ F로 분류합니다.
 *      점수에 따른 학점 부여기준은 아래와 같습니다.
 *      
 *      필수 과목 학점
 *      S       A       B       C       D       F
 *      -----------------------------------------------
 *      95~100  90~94   80~89   70~79   60~69   60미만 
 *
 *      일반 과목 학점
 *      A       B       C       D       F
 *      -----------------------------------------------
 *      90~100  80~89   70~79   55~69   55미만  
 *      
 *      학점 결과를 아래와 같이 나올 수 있도록 구현하시오.
 *      ----
 *      
 *      국어과목 학점 결과 >>>
 *      -----------------------------------------------
 *      이름          학번       필수      점수    학점    
 *      -----------------------------------------------
 *      스티브잡수    20230807   국어       95      S
 *      이순신        20230808   수학       94      A
 *      리누스토발즈  20230809   국어       100     S
 *      제임스고슬링  20230810   국어       89      B
 *      이도          20230811   수학       83      B
 *      ===============================================
 *      
 *      
 *      수학과목 학점 결과 >>>
 *      -----------------------------------------------
 *      이름          학번       필수      점수    학점    
 *      ----------------------------------------------- 
 *      스티브잡수    20230807   국어       56      D
 *      이순신        20230808   수학       98      S
 *      리누스토발즈  20230809   국어       88      B
 *      제임스고슬링  20230810   국어       94      A
 *      이도          20230811   수학       56      F
 *      ===============================================
 */


public class UiMain {
	
	School hmSchool = School.getInstances();
	Subject korean;
	Subject math;
	
	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();

	
	public void createSubject() {
		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH, "수학");
		
		hmSchool.addSubject(korean);
		hmSchool.addSubject(math);
		
	}

	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		uiMain.createSubject();
		uiMain.createStudent();
		
		String display = uiMain.gradeDisplay.getDisplay();
		System.out.println(display);
	}
	
	public void createStudent() {
		
		Student student1 = new Student("스티브잡스", 20230807, korean);
		Student student2 = new Student("이순신", 20230808, math);
		Student student3 = new Student("리누스토발즈", 20230809, korean);
		Student student4 = new Student("제임스고슬링", 20230810, korean);
		Student student5 = new Student("이도", 20230811, math);
		
		hmSchool.addStudent(student1);
		hmSchool.addStudent(student2);
		hmSchool.addStudent(student3);
		hmSchool.addStudent(student4);
		hmSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		// 과목별 성적 입력
		addScoreForStudent(student1, korean, 95);
		
	}

	private void addScoreForStudent(Student student, Subject korean, int score) {
		
//		Score score1 = new Score(student.getStudentId(), subject, score);
		
	}
	
	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for (int i=0; i<students.size();i++ ) {
			Student student = students.get(i);
//			buffer.append(student.getStudentName());
		}
	}
	
	
	
	
}
