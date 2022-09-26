
public class AcousticElectric extends Acoustic{
	protected int tone;
	protected int volume;
	public int getTone() {
		return tone;
	}
	public int getVolume() {
		return volume;
	}
	public void setTone(int tone) {
		this.tone = tone;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public AcousticElectric(String type, String soundType, int tone, int volume) {
		super(type, soundType);
		this.tone = tone;
		this.volume = volume;
	}
	
	public void add() {
		System.out.println("Acoustic Electric Guitar had been added!");
	}
}
