package kr.co.himedia.utilitiesinterface.userinfo;

// 사용자 정보 클래스: 이곳에 정의한 속성이 데이터베이스에 저장됨
public class UserInfoDTO { 
	private String userId;		// 아이디
	private String password;	// 비밀번호
	private String userName;	// 이름
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
