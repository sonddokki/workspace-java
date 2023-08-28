package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일의 끝까지 한바이트씩 자료를 읽기
public class FileInputStreamTest02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("input.txt");
			int i;
			
			while(( i = fis.read()) != -1 ) {
				
				System.out.println((char)i);
			}			
			
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
