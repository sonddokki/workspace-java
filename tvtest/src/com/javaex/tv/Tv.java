package com.javaex.tv;

public class Tv {
	
	// 필드
	// [접근제어자] [타입변수] [변수명 지정]
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자
	// 1. 기본생성자
	// [접근제어자] [클래스이름] () {}
	public Tv() {}
	
	// 2. 매개변수가 있는 생성자
	// [접근제어자] [클래스이름] (매개변수) {}
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 gs
	// [접근제어자] [타입변수] [생성자이름] (매개변수) {}
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
//===============================================
	
	// 메소드 일반
	// 1. [접근제어자] 반환타입 메서드이름(매개변수) {}
	// 2. [접근제어자] 반환타입 메서드이름() {}
	// 3. [접근제어자] 반환타입 메서드이름(매개변수) {리턴}
	// 4. [접근제어자] 반환타입 메서드이름() {리턴}
	
	public void Power(boolean on) {
		this.power = on;
	} 
	
	public void channel(int channel) {
		if (channel < 1) {
			this.channel = 255;
		} else if (channel > 255) {
			this.channel = 1;
		}
		
	}

	public void channel(boolean up) {
		if (up == true) {
			channel += 1;
		} else if (up == false) {
			channel -= 1;
		}
		
	}
	
	public void volume(int volume) {
		if (volume < 0) {
			this.volume = 0;
		} else if (volume > 100) {
			this.volume = 100;
		} 
	}

	public void volume(boolean up) {
		if (up == true) {
			this.volume += 1;
		} else if (up == false) {
			this.volume -= 1;
		}
	}
	
	// 2. [접근제어자] 반환타입 메서드이름() {}
	public void status() {
		System.out.println("TV의 현재 상태 : " + power);
		System.out.println("TV의 현재 채널 : " + channel);
		System.out.println("TV의 현재 볼륨 : " + volume);
	}

	

	
		
	

}
