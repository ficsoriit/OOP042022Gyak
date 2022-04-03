package alkalmazott.futtat;

import alkalmazott.Alkalmazott;
import alkalmazott.Munkahely;

public class MunkahelyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Munkahely iroda = new Munkahely();
		iroda.allasokatBetolt();
		iroda.nevsor();
		
		//Alkalmazott.korhatarAtallitas(70);
		//iroda.nevsor();
		
		iroda.nyugdijElottLista(5);
	}
}
