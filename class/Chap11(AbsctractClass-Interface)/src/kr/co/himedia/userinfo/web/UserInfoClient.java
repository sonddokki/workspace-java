package kr.co.himedia.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kr.co.himedia.utilitiesinterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesinterface.userinfo.dao.UserInfoDAO;
import kr.co.himedia.utilitiesinterface.userinfo.dao.mysql.MySQLDAOImpl;
import kr.co.himedia.utilitiesinterface.userinfo.dao.oracle.OracleDAOImpl;
import kr.co.himedia.utilitiesinterface.userinfo.dao.postgres.PostgreSQLDAOImpl;

public class UserInfoClient {
   public static void main(String[] args) throws IOException {
      // 바이트 단위 입력 스트림
//      FileInputStream fis = new FileInputStream("db.properties");
      InputStream fis = new FileInputStream("db.properties"); // 다형성
      
      Properties prop = new Properties();
      prop.load(fis);
      String dbType = prop.getProperty("DBTYPE");
      
      // 프론트에서 받는 부분
      UserInfoDTO userDTO = new UserInfoDTO();
      userDTO.setUserId("himedia");
      userDTO.setPassword("1234");
      userDTO.setUserName("하이미디어");
      
      // db.properties 파일에서 DBTYPE의 값에 따라 다른 객체 생성
      UserInfoDAO userDAO = null;
      
      if (dbType.equals("PostgreSQL")) {
         userDAO = new PostgreSQLDAOImpl();
      } else if (dbType.equals("Oracle")) {
         userDAO = new OracleDAOImpl();
      } else if (dbType.equals("MySQL")) {
         userDAO = new MySQLDAOImpl();
      }else {
         System.out.println("db support error");
      }
      
      // userDAO가 참조하는 인스턴스의 메서드 실행 
      userDAO.insertUserInfo(userDTO);
      userDAO.updateUserInfo(userDTO);
      userDAO.deleteUserInfo(userDTO);
      userDAO.selectUserInfo(userDTO);
   }

}
