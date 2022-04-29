package homero;

import java.util.Scanner;

import homero.Homerseklet.Mertekegyseg;

public class hoProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Homerseklet tomb[] = new Homerseklet[4];
	
	// Beolvasas helyett egyelore rtékadassol
	/*
	tomb[0] = new Homerseklet(15);
	tomb[0].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
	tomb[1] = new Homerseklet(300);
	tomb[1].setMertekegyseg(Homerseklet.Mertekegyseg.KELVIN);
	tomb[2] = new Homerseklet(58.2614336710285);
	tomb[2].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
	tomb[3] = new Homerseklet(86.99428465068647);
	tomb[3].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
*/
	tomb[0] = new Homerseklet(intBeolvas(15));
	tomb[0].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
	tomb[1] = new Homerseklet(intBeolvas(300));
	tomb[1].setMertekegyseg(Homerseklet.Mertekegyseg.KELVIN);
	tomb[2] = new Homerseklet(100.0 * Math.random());
	tomb[2].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
	tomb[3] = new Homerseklet(100.0 * Math.random());
	tomb[3].setMertekegyseg(Homerseklet.Mertekegyseg.CELSIUS);
	
	
	listaz(tomb);
	System.out.println("Konverzio");
	System.out.println(Homerseklet.konvHomerseklet(tomb[0],Homerseklet.Mertekegyseg.KELVIN));
	
	System.out.println("Atlaghomerseklet: " + atlaghomerseklet(tomb));
	}
	
	

	public static void listaz(Homerseklet tomb[]) {
		for (Homerseklet elem: tomb) {
			System.out.println(elem);
		}
	}
	
	public static double atlaghomerseklet(Homerseklet tomb[]) {
		double atlag = 0;
		for (Homerseklet elem : tomb) {
			switch (elem.getMertekegyseg()) {
			case KELVIN: 
				atlag += elem.getHomeseklet();
				break;
			case CELSIUS: 
				atlag += Homerseklet.konvHomerseklet(elem, Mertekegyseg.KELVIN);
			}
		}
		return atlag / tomb.length;
	}
	
	public static int intBeolvas(int ertek) {
		int szam;
		boolean ok = true;
		Scanner sc = new Scanner(System.in);
		do {
			ok = true;
			if (!sc.hasNextInt()) {
				ok = false;
				System.out.println("Hibás adadt!");
			}
			szam = sc.nextInt();
			if (szam != ertek) {
				ok = false;
				System.out.println("Hibás adat!");				
			}
		} while (!ok);
		
		return szam;
		
	}
}
