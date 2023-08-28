package kr.co.himedia.utilitiesinterface.userinfo.dao;

import kr.co.himedia.utilitiesinterface.userinfo.UserInfoDTO;

// DAO에서 제공해야 할 메서드를 선언한 인터페이스
public interface UserInfoDAO {
	void insertUserInfo(UserInfoDTO userInfoDTO);	// 사용자 정보 추가
	void updateUserInfo(UserInfoDTO userInfoDTO);	// 사용자 정보 중 password, name 수정 
	void deleteUserInfo(UserInfoDTO userInfoDTO);	// 사용자 정보 삭제
	void selectUserInfo(UserInfoDTO userInfoDTO);	// 사용자 정보 검색
}
