package alkalmazott;

import java.util.Scanner;

public class Munkahely {
	private int letszam;
	private Alkalmazott[] alkalmazottak;
	
	public Munkahely() {
		letszamBeolvas();
		alkalmazottak = new Alkalmazott[letszam];
	}
	
	// Ezt csak a konstruktor haszn�lja, nem kell public-nak lennie 
	private void letszamBeolvas() {
		System.out.println("L�tsz�m: ");
		Scanner sc = new Scanner(System.in);
		letszam = sc.nextInt();		
	}
	
	public void allasokatBetolt() {
		//Beolvasas helyett, hogy gyorsabb legyen
		for (int i=0; i<letszam; i++) {
			alkalmazottak[i] =new Alkalmazott("bela" + (i+1), 55 + i);
		}
	}
	
	public void nevsor( ) {
		System.out.println("Az alkalmazottak adatai: ");
		for(Alkalmazott elem : alkalmazottak) {
			System.out.println(elem);
		}
	
	}
	
	public void nyugdijElottLista(int hatravan) {
		System.out.println("Nyugd�j el�tt �ll�k:");
		for(Alkalmazott elem : alkalmazottak) {
			if (elem.nyugdijigHatralevoIdo() < hatravan) {
				System.out.println(elem);
			}
		}
	}
	
}
