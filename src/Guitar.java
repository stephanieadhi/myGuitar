import java.util.ArrayList;

public class Guitar {
	protected ArrayList<Acoustic> list;

	public ArrayList<Acoustic> getList() {
		return list;
	}

	public void setList(ArrayList<Acoustic> list) {
		this.list = list;
	}

	public Guitar(ArrayList<Acoustic> list) {
		super();
		this.list = list;
	}
}
