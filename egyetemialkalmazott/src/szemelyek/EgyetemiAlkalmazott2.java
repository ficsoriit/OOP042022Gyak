package szemelyek;

public class EgyetemiAlkalmazott2 extends Alkalmazott {
	private Beosztas beosztas;
	private static final int alapber = 500000;
	
	public EgyetemiAlkalmazott2(String nev, int kor, String munkahely, Beosztas beosztas) {
		super(nev, kor, munkahely, alapber); // Itt a fizetes lehet barmi!!!
		this.beosztas = beosztas;
		switch (beosztas) {
		case PROF : setFizetes(alapber);
			break;
		case OKTATO : setFizetes((int)(alapber*0.5));
			break;
		case ADMIN : setFizetes((int)(alapber*0.3));
		}
	}

	
	public Beosztas getBeosztas() {
		return beosztas;
	}


	@Override
	public String toString() {
		return "EgyetemiAlkalmazott [beosztas=" + beosztas + ", toString()=" + super.toString() + "]";
	}


	/*	
	Ez igy most hibas, mert nincs feluldefinialhato oroklott metodus!
	@Override
	public int compareTo(EgyetemiAlkalmazott2 o) {
		// TODO Auto-generated method stub
		return getFizetes() - o.getFizetes();
	}
	*/
}
