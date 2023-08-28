package kr.co.himedia.thread05.solve;

import java.util.ArrayList;

// 대여할 책이 포함된 클래스
class HiMediaBooks {
	
	// 배열생성
	public ArrayList<String> shelf = new ArrayList<>();
	
	// 배열 안에 책을 넣기
	public HiMediaBooks() {
		shelf.add("친절한 깃&깃허브");
		shelf.add("친절한 깃&깃허브2");
		shelf.add("친절한 깃&깃허브3");
	}
	
	// 배열안에 있는 책을 빼오는 메서드
	// 세명만 빌릴 수 있는 상황
	public synchronized String lendBook() throws InterruptedException {
		
		if (shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " waiting start ");
			wait();
			System.out.println(Thread.currentThread().getName() + " waiting end ");
		}
		
		if (shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(Thread.currentThread().getName() + " : "+ book + " 대여함");
			return book;
		}
		else return null;
		
	}
	
	// 책을 다시 돌려놓는 메서드
	public synchronized void returnBook(String book) {
		shelf.add(book);
		notify();
		System.out.println(Thread.currentThread().getName() + " : "+ book + " 반납함");
	}

}

// 스레드를 상속받은 사람 클래스 생성
class Person extends Thread {
	  
	public Person(String name) {
		super(name);
	}
 
	@Override
	public void run()  {
		String title;
		try {
			title = SyncWaitNotifyTest.hiBooks.lendBook();
			if (title == null) {
				System.out.println(getName() + " 빌리지 못했음");
				return;
			}
			Thread.sleep(5000);   // 5초간 지연됨
			SyncWaitNotifyTest.hiBooks.returnBook(title);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
}
	
	
public class SyncWaitNotifyTest {
	
	public static HiMediaBooks hiBooks = new HiMediaBooks();
	
	public static void main(String[] args) {
		Person person = new Person("person");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");
		
		person.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();

	}
}
