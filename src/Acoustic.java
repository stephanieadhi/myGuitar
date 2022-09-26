
public class Acoustic {
	protected String type;
	protected String soundType;
	public String getType() {
		return type;
	}
	public String getSoundType() {
		return soundType;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	public Acoustic(String type, String soundType) {
		super();
		this.type = type;
		this.soundType = soundType;
	}
	public void add() {
		System.out.println("Acoustic Guitar had been added!");
	}
}
