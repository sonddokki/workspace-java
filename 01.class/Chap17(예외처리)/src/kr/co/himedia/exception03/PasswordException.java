package kr.co.himedia.exception03;

// extends으로 예외 클래스를 상속
public class PasswordException extends Exception {
	
	// 예외처리할때 메세지를 띄워주는 객체생성
	public PasswordException(String message) {
		super(message);
	}
	
	

}
