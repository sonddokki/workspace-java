package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 
public class FileInputStreamTest04 {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			
			int i;
			byte[] bs = new byte[10];
			while(( i = fis.read(bs, 0, 9)) != -1 ) {
				for (int k=0;k<i;k++) {
					System.out.print((char)bs[k]);
				}
				
				System.out.println(" : "+i+"바이트 읽음");
			}			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		

	}
}
