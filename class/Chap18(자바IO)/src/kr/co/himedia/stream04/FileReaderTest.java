package kr.co.himedia.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		
//		try(FileInputStream fis = new FileInputStream("reader.txt")) {  // 한글을 인식 못함
		try(FileReader fis = new FileReader("reader.txt")) {   // 한글 인식 가능
			int i;
			
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
