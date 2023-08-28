package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일에서 한 바이트씩 읽어들이기
public class FileInputStreamTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("input.txt");
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}		
		}
		
		System.out.println("end");
		

	}
}
