package kr.co.himedia.stream06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 상속
class Person implements Serializable{
	
	String name;
	String jop;
	
	public Person(String name, String jop) {
//		super();
		this.name = name;
		this.jop = jop;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", jop=" + jop + "]";
	}

}

public class SerializationTest {
	
	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personShin = new Person("신사임당", "상무이사");
		
		//                         바이너리데이터 저장이라 txt가 의미없음
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personShin);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
