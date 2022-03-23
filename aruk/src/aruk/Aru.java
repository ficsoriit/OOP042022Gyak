package aruk;

public class Aru {
	private String megnevezes;
	private int nettoAr;
	private int afakulcs;
	
	public Aru(String megnevezes, int nettoAr, int afakulcs) {
		super();
		this.megnevezes = megnevezes;
		this.nettoAr = nettoAr;
		this.afakulcs = afakulcs;
	}

	@Override
	public String toString() {
		return "Aru [megnevezes=" + megnevezes + ", bruttoAr=" + bruttoAr() + "]";
	}
	
	public int bruttoAr( ) {
		return nettoAr + nettoAr*afakulcs/100;
	}
	
	public void aremeles(int emeles) {
		nettoAr += nettoAr * emeles / 100.;
	}
	
	public int compareTo(Aru masik) {
		if (bruttoAr() < masik.bruttoAr()) return -1;
		if (bruttoAr() > masik.bruttoAr()) return 1;
		return 0;
	}
	
}
