package kr.co.himedia.MagicNumber.before;

public class Robot {
	
	private String name;

	public Robot(String name) {
		this.name = name;
	}
	
	public void order(int command) {
		
		if (command == 0)
			System.out.println(name + " walk");
		else if (command == 1)
			System.out.println(name + " step");
		else if (command == 2)
			System.out.println(name + " jump");
		else {
			System.out.println(" error");
		}
	}
	
	

}
