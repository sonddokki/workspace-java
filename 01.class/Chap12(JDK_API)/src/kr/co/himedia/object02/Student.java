package kr.co.himedia.object02;

public class Student implements Cloneable {
	// 복제를 허용한다고 명시
	
	private int studeatId;
	private String studeatName;
	
	public Student(int studeatId, String studeatName) {
//		super();
		this.studeatId = studeatId;
		this.studeatName = studeatName;
	}

	public void setStudeatName(String studeatName) {
		this.studeatName = studeatName;
	}
	
	
	// 재정의
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			if (this.studeatId == stu.studeatId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	// 해시코드 재정의
	@Override
	public int hashCode() {
		return studeatId;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return studeatId +", "+ studeatName;
	}
	
}
