
public class Electric extends AcousticElectric{
	protected int switchPosition;

	public int getSwitchPosition() {
		return switchPosition;
	}

	public void setSwitchPosition(int switchPosition) {
		this.switchPosition = switchPosition;
	}

	public Electric(String type, String soundType, int tone, int volume, int switchPosition) {
		super(type, soundType, tone, volume);
		this.switchPosition = switchPosition;
	}
	
	public void add() {
		System.out.println("Electric Guitar had been added!");
	}
	
}
