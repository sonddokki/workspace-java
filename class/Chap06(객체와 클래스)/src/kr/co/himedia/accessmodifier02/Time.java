package kr.co.himedia.accessmodifier02;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	// getter()
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		// 예외처리 코드 
		if ( hour < 0 || hour > 24) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if ( minute < 0 || minute > 60) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if ( second < 0 || second > 60) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return this.getHour() +"시 "+
				this.getMinute() +"분 "+
				this.getSecond() +"초 입니다.";
	}
	
	

}
