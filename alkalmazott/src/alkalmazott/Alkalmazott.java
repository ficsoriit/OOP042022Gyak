package alkalmazott;

public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	private static int nyugdijKorhatar = 65;
	
	public Alkalmazott(String nev, int kor, int fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev, int kor) {
		/* Ez a megoldas a kodismetlodes miatt el�telendo
		 * semmikeppen NEM fogadhato el!!!
		 
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000*kor;
		*/
		this(nev, kor, 10000*kor);
	}
	
	
	


	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + 
				", fizetes=" + fizetes + ", NyugdijigH�tralev�Id�: "
				+ nyugdijigHatralevoIdo() + "]";
	}

	public int nyugdijigHatralevoIdo() {
		return nyugdijKorhatar - kor;
	}
	
	// A feladatki�r�st�l elt�r�en!!!
	public Alkalmazott aFiatalabb (Alkalmazott masik) {
		if (nyugdijigHatralevoIdo() > masik.nyugdijigHatralevoIdo()) {
			return this;
		}
		return masik;
	}
	
	public static void korhatarAtallitas(int ujKorhtar) {
		nyugdijKorhatar = ujKorhtar;
	}
}
