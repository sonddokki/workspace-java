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
	public Tv(int ch, int vo, boolean po) {
		this.channel = ch;
		this.volume = vo;
		this.power = po;
	}

	// [접근제어자] [타입변수] [생성자이름] (매개변수) {}
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}

	public boolean Power(boolean power) {
		return this.power = power;
	} 
//===============================================
	public int channel(int channel) {
		return this.channel = channel;
		
	}

	public boolean channelUp(boolean b) {
		return this.channelUp(b);
	}
	
	public int volume(int volume) {
		return this.volume = volume;
		
	}

	public void volumeUp(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	// 메서드 - 기능
	// 1. [접근제어자] 반환타입 메서드이름(매개변수) {}
	// 2. [접근제어자] 반환타입 메서드이름() {}
	// 3. [접근제어자] 반환타입 메서드이름(매개변수) {리턴}
	// 4. [접근제어자] 반환타입 메서드이름() {리턴}
	

	// 2. [접근제어자] 반환타입 메서드이름() {}
	public void status() {
		System.out.println("TV의 현재 상태 : " + power);
		System.out.println("TV의 현재 채널 : " + channel);
		System.out.println("TV의 현재 볼륨 : " + volume);
	}

	

	
		
	

}
