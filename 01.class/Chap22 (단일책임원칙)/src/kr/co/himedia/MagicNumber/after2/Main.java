package kr.co.himedia.MagicNumber.after2;

public class Main {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot("이순신");
		robot.order(Robot.Command.walk);
		robot.order(Robot.Command.jump);
		robot.order(Robot.Command.stop);
		
		

//		robot.order(Robot.Command.);
		
	}

}
