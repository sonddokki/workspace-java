package kr.co.himedia.exception03;

public class PasswordTest {
	
	private String passwd;
	
	// 패스워드를 가져오는 생성자 생성 // 예외처리 포함
	public void setPasswd(String passwd) throws PasswordException {
		
		
		if ( passwd == null )
			// 패스워드는 null일 수 없음
			throw new PasswordException("비밀번호를 입력하세요.");
		else if (passwd.length() < 5)
			// 패스워드의 길이는 5자 이상이어야함
			throw new PasswordException("패스워드는 5자 이상이어야 합니다.");
		else if (passwd.matches("[a-zA-Z]+")) 
			// 패스워드에 ""문자를 포함하여야함
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		
		
		this.passwd =  passwd;
		
	}
	
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		//=================================================
		String password = null;
		// 비밀번호 미입력
		try {
			test.setPasswd(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//=================================================
		System.out.println();
		password = "hime";
		// 비밀번호 길이 미충족
		try {
			test.setPasswd(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//=================================================
		System.out.println();
		password = "abcdef";
		// 비밀번호 문자포함 미충족
		try {
			test.setPasswd(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//=================================================
		System.out.println("end");
		
		
	}
	
	

}
