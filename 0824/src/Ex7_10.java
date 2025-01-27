
class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	private int prevChannel = 0;
	void gotoPrevChannel() {
		int tempChannel = this.channel;
		this.channel = prevChannel;
		prevChannel = tempChannel;
	}
}

public class Ex7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}

//CH:10
//VOL:20