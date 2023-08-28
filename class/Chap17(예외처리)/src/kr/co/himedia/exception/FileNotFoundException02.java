package kr.co.himedia.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("himedia.txt");
			
			
			 
			try {
				fis.close();
				System.out.println("here");
				
			} catch (IOException e) {
				e.printStackTrace();
			}		
					
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
			
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("fianlly 블록은 항상 수행");
			
		}
		
		System.out.println("end");
		
	}

}
