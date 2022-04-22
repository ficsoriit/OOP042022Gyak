package szemelyekteszt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import szemelyek.Beosztas;
import szemelyek.EgyetemiAlkalmazott;
import szemelyek.EgyetemiAlkalmazott2;
import szemelyek.Szemely;
import szemelyek.sortBySalery;
import szemelyek.sortBySalery2;

public class SzemelyekTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ALKAMAZOTTAK_SZAMA = 3;
		System.out.println("Statikus tömb használata");
		EgyetemiAlkalmazott alkalmazottak[] = new EgyetemiAlkalmazott[ALKAMAZOTTAK_SZAMA];
		alkalmazottak[0] = new EgyetemiAlkalmazott("Zeno pista", 63, "Info", Beosztas.PROF);
		alkalmazottak[1] = new EgyetemiAlkalmazott("Nagy pista", 40, "Info", Beosztas.OKTATO);
		alkalmazottak[2] = new EgyetemiAlkalmazott("Adam Józsi", 33, "Info", Beosztas.ADMIN);
		
		nevsor(alkalmazottak);
		
		statisztika(alkalmazottak);
		
		Arrays.sort(alkalmazottak);
		System.out.println("A rendezett tömb (Comparable interface használatával):");
		System.out.println("A rendezési szempont az osztály compareTo() metódusában definiált.");
		nevsor(alkalmazottak);
		
		EgyetemiAlkalmazott2 alkalmazottak2[] = new EgyetemiAlkalmazott2[ALKAMAZOTTAK_SZAMA];
		alkalmazottak2[0] = new EgyetemiAlkalmazott2("Zeno pista", 63, "Info", Beosztas.PROF);
		alkalmazottak2[1] = new EgyetemiAlkalmazott2("Nagy pista", 40, "Info", Beosztas.OKTATO);
		alkalmazottak2[2] = new EgyetemiAlkalmazott2("Adam Józsi", 33, "Info", Beosztas.ADMIN);
		
		System.out.println("alkalmazottak2");
		nevsor2(alkalmazottak2);

		Arrays.sort(alkalmazottak2, new sortBySalery());
		System.out.println("A rendezett tömb a Comparator használatával, a rendezési szempont a sortBySalery osztályban definiált");
		nevsor2(alkalmazottak2);
		
		// Dinamikus tömb - most üres
		System.out.println("\n\nMostantól dinamikus tömböt használunk");
		ArrayList<EgyetemiAlkalmazott2> alkalmazottak3 = new ArrayList<>();
		//Feltoltes
		alkalmazottak3.add(new EgyetemiAlkalmazott2("Zeno pista", 63, "Info", Beosztas.PROF));
		alkalmazottak3.add(new EgyetemiAlkalmazott2("Nagy pista", 40, "Info", Beosztas.OKTATO));
		alkalmazottak3.add(new EgyetemiAlkalmazott2("Adam Józsi", 33, "Info", Beosztas.ADMIN));
		System.out.println("alkalmazottak3");
		nevsor3(alkalmazottak3);
		alkalmazottak3.remove(0);
		System.out.println("alkalmazottak3 remove");
		nevsor3(alkalmazottak3);
		alkalmazottak3.add(0, new EgyetemiAlkalmazott2("Zeno pista", 63, "Info", Beosztas.PROF));
		System.out.println("alkalmazottak3 add(i,...)");
		nevsor3(alkalmazottak3);
		System.out.println("alkalmazottak3 elem kinyerese");
		System.out.println(alkalmazottak3.get(1));
		System.out.println("metodushivqs a kinyert alkalmazottak3 elemre");
		System.out.println(alkalmazottak3.get(1).getFizetes());	
		
		System.out.println("Rendezes Comparator segítségével - a rendezési szempont a sortBySalery2 osztályban definiálva");
		Collections.sort(alkalmazottak3, new sortBySalery2());
		nevsor3(alkalmazottak3);
		
		ArrayList<EgyetemiAlkalmazott> alkalmazottak4 = new ArrayList<>();
		//Feltoltes
		alkalmazottak4.add(new EgyetemiAlkalmazott("Zeno pista", 63, "Info", Beosztas.PROF));
		alkalmazottak4.add(new EgyetemiAlkalmazott("Nagy pista", 40, "Info", Beosztas.OKTATO));
		alkalmazottak4.add(new EgyetemiAlkalmazott("Adam Józsi", 33, "Info", Beosztas.ADMIN));
		System.out.println("alkalmazottak4");
		nevsor4(alkalmazottak4);
		
		System.out.println("Rendezes Comparable interface segítségével");
		System.out.println("A rendezési szempont az osztály compareTo() metódusában definiált.");
		Collections.sort(alkalmazottak4);
		nevsor4(alkalmazottak4);
		
		
	}
	
	
	static void nevsor(EgyetemiAlkalmazott alk[]) {
		for (EgyetemiAlkalmazott elem : alk) {
			System.out.println(elem);
		}
	}

	static void nevsor2(EgyetemiAlkalmazott2 alk[]) {
		for (EgyetemiAlkalmazott2 elem : alk) {
			System.out.println(elem);
		}
	}
	
	static void nevsor3(ArrayList<EgyetemiAlkalmazott2> alkalmazottak) {
		for (Szemely elem : alkalmazottak) {
			System.out.println(elem);
		}
	}
	
	static void nevsor4(ArrayList<EgyetemiAlkalmazott> alkalmazottak) {
		for (Szemely elem : alkalmazottak) {
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
