package kr.co.himedia.tvMaking;

public class Tv {

	
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	
	public Tv(int channel, int volume, boolean power) {
//		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "TvFunction [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	
	
}
