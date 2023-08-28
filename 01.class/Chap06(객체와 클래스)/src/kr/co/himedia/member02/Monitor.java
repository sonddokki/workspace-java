package kr.co.himedia.member02;

public class Monitor {
		
	
		// 멤버변수 (필수)
		int price;          // 가격
		String resolution;  // 해상도
		int size;           // 사이즈 (인치)
		int refreshRate;    // 주사율
		boolean power;      // 파워
		int channel;        // 채널
		
		// 멤버메서드
		public void powerTogle() {
			if (!power) {
				System.out.println("모니터가 켜졌습니다.");	
				this.power = !power;
			}
			else {
				System.out.println("모니터가 꺼졌습니다.");		
				this.power = !power;
			}
		}
		
		public void channelUp() {
			this.channel++;
			System.out.println("현재 채널 : " + this.channel);
		}
		public void channelDown() {
			System.out.println("현재 채널 : " + (--this.channel));
		}
		
}
