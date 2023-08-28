package kr.co.himedia.member02;

public class Monitor02 {
		
	
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		
		monitor.price = 200000;
		monitor.resolution = "FHD";
		monitor.size = 27;
		monitor.refreshRate = 144;
		
		System.out.println(monitor.price);
		System.out.println(monitor.resolution);
		System.out.println(monitor.size);
		System.out.println(monitor.refreshRate);
		
		System.out.println();

		System.out.println(monitor.power);
		
		monitor.powerTogle();
		monitor.powerTogle();
		monitor.powerTogle();
		
		System.out.println(monitor.power);
		
		System.out.println(monitor.channel);
		
		
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelUp();
		
		
		monitor.channelDown();
		
		
		monitor.power = true;
	}
}
