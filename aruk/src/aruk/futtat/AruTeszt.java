package aruk.futtat;

import aruk.Aru;
import aruk.Kenyer;

public class AruTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aru aru = new Aru("sor", 320, 27);
		Kenyer kenyer = new Kenyer("Feher", 400, 5, 0.75);
		System.out.println(aru);
		System.out.println(kenyer);
		int eredmeny = aru.compareTo(kenyer);
		System.out.println("aru.compareTo(kenyer):  " +eredmeny);
		Kenyer masikKenyer = new Kenyer("kicsi", 200, 5, 0.25);
		eredmeny = kenyer.compareTo(masikKenyer);
		System.out.println("kenyer.compareTo(masikKenyer):  " +eredmeny);
		eredmeny = Kenyer.osszehassonlit(kenyer, masikKenyer);
		System.out.println("Kenyer.osszehassonlit(kenyer, masikKenyer):  " +eredmeny);
		Aru kenyer2 = new Kenyer("Magos", 400, 5, 0.5);
		System.out.println(kenyer);
		Kenyer kenyer3 = new Kenyer("aa", 200, 5, 0.5);
		Kenyer.osszehassonlit((Kenyer)kenyer2, kenyer3);
	}
}
