package tv;

public class TV {
	private int channel; // 1~255 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것
	private int volume; // 0~100 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
		
	public int getChannel() {		
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void status() {
		System.out.println("TV[channel=" + channel + 
							", volume="   + volume  + 
							", power="    + (power ? "On" : "Off") + "]");	
	}
	
	public void channel(boolean channel) {
		this.channel++;
		if(channel == false) {
			this.channel--;
		}
		
		if(this.channel < 1) {
			this.channel = 255;
		}else if(this.channel > 255) {
			this.channel = 0;
		}
	}
	
	public void volume(boolean volume) {
		this.volume++;
		if(volume == false) {
			this.volume--;
		}
		
		if(this.volume < 0) {
			this.volume = 0;
		}else if(this.volume > 100) {
			this.volume = 0;
		}
	}

	
}
