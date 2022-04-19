package szemelyekteszt;

import java.util.Arrays;

import szemelyek.Beosztas;
import szemelyek.EgyetemiAlkalmazott;

public class SzemelyekTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ALKAMAZOTTAK_SZAMA = 3;
		EgyetemiAlkalmazott alkalmazottak[] = new EgyetemiAlkalmazott[ALKAMAZOTTAK_SZAMA];
		alkalmazottak[0] = new EgyetemiAlkalmazott("Zeno pista", 63, "Info", Beosztas.PROF);
		alkalmazottak[1] = new EgyetemiAlkalmazott("Nagy pista", 40, "Info", Beosztas.OKTATO);
		alkalmazottak[2] = new EgyetemiAlkalmazott("Adam Józsi", 33, "Info", Beosztas.ADMIN);
		
		nevsor(alkalmazottak);
		
		statisztika(alkalmazottak);
		
		Arrays.sort(alkalmazottak);
		System.out.println("A rendezett tömb:");
		nevsor(alkalmazottak);
	}
	
	
	static void nevsor(EgyetemiAlkalmazott alk[]) {
		for (EgyetemiAlkalmazott elem : alk) {
			System.out.println(elem);
		}
	}
	
	static void statisztika(EgyetemiAlkalmazott alk[]) {
		int profok = 0;
		int oktatok = 0;
		int adminok = 0;
		for (EgyetemiAlkalmazott elem : alk) {
			switch(elem.getBeosztas()) {
			case PROF : 
				profok++;
				break;
			case OKTATO :
				oktatok++;
				break;
			case ADMIN :
				adminok++;
			}
		}
		
		System.out.println("Professzorok: " + profok);
		System.out.println("Oktatok: " + oktatok);
		System.out.println("Adminok: " + adminok);
	}

}
