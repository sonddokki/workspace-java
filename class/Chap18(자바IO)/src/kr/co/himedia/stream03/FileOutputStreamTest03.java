package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest03 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos) {
			byte data = 65;                //'A'의 아스키코드값
			byte[] bs = new byte[26];
			for (int i=0;i<bs.length;i++) {
				bs[i] = data++;
			}
			fos.write(bs,2,10);                  // 배열의 두번째부터 10번 출력

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("출력이 완료되었습니다.");
		
	}

}
