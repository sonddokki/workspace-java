package kr.co.himedia.abstractclass;

public class ComputerTest {
	public static void main(String[] args) {
		Computer deskTop = new DeskTop();
		
		deskTop.display();
//		deskTop.typing();
		deskTop.turnOff();
		
		Notebook myNotebook = new MyNotebook();
		
		myNotebook.typing();
	}
}
