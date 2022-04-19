package szemelyek;

public class EgyetemiAlkalmazott extends Alkalmazott implements Comparable<EgyetemiAlkalmazott>{
	private Beosztas beosztas;
	private static final int alapber = 500000;
	
	public EgyetemiAlkalmazott(String nev, int kor, String munkahely, Beosztas beosztas) {
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


	@Override
	public int compareTo(EgyetemiAlkalmazott o) {
		// TODO Auto-generated method stub
		return getFizetes() - o.getFizetes();
	}


}
