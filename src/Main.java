import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	ArrayList<Acoustic> guitarList = new ArrayList<>();
	Guitar guitar = new Guitar(guitarList);
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public Main() {
		int choose;
		do {
			menu();
			choose = sc.nextInt();
			sc.nextLine();
			
			switch (choose) {
			case 1:
				buildGuitar();
				break;

			case 2:
				display();
				break;
			}
		} while (choose!=3);
	}
	
	private void display() {
		// TODO Auto-generated method stub
		System.out.println("[GuitarType]-[GuitarSoundType]-[Tone]-[Volume]-[SwitchPosition]");
		for (Acoustic acoustic : guitarList) {
			if (acoustic instanceof Electric) {
				System.out.println(acoustic.getType() + " - " + acoustic.getSoundType() + " - " + ((Electric) acoustic).getTone() + " - " + ((Electric) acoustic).getVolume() + " - " + ((Electric) acoustic).getSwitchPosition());
			}else if (acoustic instanceof AcousticElectric) {
				System.out.println(acoustic.getType() + " - " + acoustic.getSoundType() + " - " + ((AcousticElectric) acoustic).getTone() + " - " + ((AcousticElectric) acoustic).getVolume());
			}else {
				System.out.println(acoustic.getType() + " - " + acoustic.getSoundType());
			}
		}
	}

	private void buildGuitar() {
		// TODO Auto-generated method stub
		int type;
		System.out.println("1.Acoustic");
		System.out.println("2.Electric");
		System.out.println("3.Acoustic Electric");
		do {
			System.out.printf("Input guitar type[1..3]: ");
			type = sc.nextInt();
			sc.nextLine();
		} while (type<1 || type>3);
		
		switch (type) {
		case 1:
			int sound;
			sound = rand.nextInt(2);
			if(sound == 0) {
				Acoustic a = new Acoustic("Acoustic Guitar", "warm");
				guitarList.add(a);
			}else {
				Acoustic a = new Acoustic("Acoustic Guitar", "bright");
				guitarList.add(a);
			}
			break;
			
		case 2:
			int switchPosition, tone, volume;
			String genre;
			do {
				System.out.printf("Input switch position: ");
				switchPosition = sc.nextInt();
				sc.nextLine();
			} while (switchPosition<1 || switchPosition>4);
			
			System.out.printf("Input tone: ");
			tone = sc.nextInt();
			sc.nextLine();
			System.out.printf("Input volume: ");
			volume = sc.nextInt();
			sc.nextLine();
			if (switchPosition == 1) {
				genre = "Funk";
			}else if (switchPosition == 2) {
				genre = "Jazz";
			}else if (switchPosition == 3) {
				genre = "Blues";
			} else {
				genre = "Rock";
			}
			Electric e = new Electric("Electric Guitar", genre, tone, volume, switchPosition);
			guitarList.add(e);
			break;
		
		case 3:
			AcousticElectric ae = new AcousticElectric("Acoustic Electric Guitar", "crunch", 0, 0);
			guitarList.add(ae);
			break;
		}
	}

	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("MyGuitar");
		System.out.println("==================================================");
		System.out.println("1. Build Guitar");
		System.out.println("2. Display List of Guitar");
		System.out.println("3. Exit");
		System.out.printf("Choose menu[1..3]: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
