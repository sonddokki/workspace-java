package kr.co.himedia.MagicNumber.after;

public class Robot {
	
	private String name;
	
	public static final int COMMAD_WALK = 0;
	
	public static final int COMMAD_STOP = 1;

	public static final int COMMAD_JUMP = 2;

	
	public Robot(String name) {
		this.name = name;
	}
	
	
	public void order(int command) {
		
		if (command == COMMAD_WALK)
			System.out.println(name + " walk");
		else if (command == COMMAD_STOP)
			System.out.println(name + " step");
		else if (command == COMMAD_JUMP)
			System.out.println(name + " jump");
		else {
			System.out.println(" error");
		}
	}
	
	

}
