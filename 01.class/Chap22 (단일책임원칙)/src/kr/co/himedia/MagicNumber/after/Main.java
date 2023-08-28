package kr.co.himedia.MagicNumber.after;

public class Main {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot("이순신");
		robot.order(Robot.COMMAD_WALK);
		robot.order(Robot.COMMAD_JUMP);
		robot.order(Robot.COMMAD_STOP);
		
		

		robot.order(10);
		
	}

}
