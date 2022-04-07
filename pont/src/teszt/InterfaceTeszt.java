package teszt;

import java.awt.Color;

import aru.Toll;
import szinezheto.SzinesPont;
import szinezheto.Szinezheto;

public class InterfaceTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szinezheto szinesPont = new SzinesPont();
		System.out.println(szinesPont);
		szinesPont.setSzin(Color.GREEN);
		System.out.println(szinesPont);
		
		Szinezheto toll = new Toll("Parker", Color.BLACK, 2000);
		System.out.println(toll);
		toll.setSzin(Color.GREEN);
		System.out.println(toll);	
		
		setDefaultColor(toll);
		System.out.println(toll);
	}
	
	public static void setDefaultColor(Szinezheto valami) {
		valami.setSzin(Szinezheto.alapertelezettSzin);
	}

}
