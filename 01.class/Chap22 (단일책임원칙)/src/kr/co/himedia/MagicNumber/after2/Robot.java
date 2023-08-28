package kr.co.himedia.MagicNumber.after2;

public class Robot {
	
	private String name;
	
//	public static final int COMMAD_WALK = 0;
//	
//	public static final int COMMAD_STOP = 1;
//
//	public static final int COMMAD_JUMP = 2;
	
	
	public enum Command {
		walk, stop, jump
	}

	
	public Robot(String name) {
		this.name = name;
	}
	
	
	public void order(Robot.Command command) {
		
		if (command == Command.walk)
			System.out.println(name + " walk");
		else if (command == Command.stop)
			System.out.println(name + " stop");
		else if (command == Command.jump)
			System.out.println(name + " jump");
		else {
			System.out.println(" error");
		}
	}
	
	

}
