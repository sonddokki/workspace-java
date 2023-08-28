package kr.co.himedia.stream05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 읽어들여서 복사해서 출력
public class FileCopyTest {
	
	public static void main(String[] args) {
		
		long millisecond = 0;
		
		
		try(FileInputStream fis = new FileInputStream("jdk-20.0.1_doc-all.zip");  // 파일을 찾아서 들여오기
			 FileOutputStream fos = new FileOutputStream("copyfile5.zip")) {      // 파일을 내보내서 생성
			
			// 몇초 걸렸는지 long 값으로 저장
			millisecond = System.currentTimeMillis();
			
			int i;
			// i는 파일읽기가 음수가 아닐때까지 진행
			while ( (i = fis.read()) != -1 ) {
				// 내보내기
				fos.write(i);
			}
			
			
			millisecond = System.currentTimeMillis() - millisecond;			
			
		// 파일이 없을 경우와 그외 상위예외처리
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + "초 동안 복사가 완료되었습니다.");
		
	}
	
	

}
