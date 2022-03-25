package aruk;

public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String megnevezes, int nettoAr, int afakulcs, double mennyiseg) {
		super(megnevezes, nettoAr, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	public double getMennyiseg() {
		return mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() + "egységár: " + getEgysegar() + "]";
	}
	
	private double getEgysegar() {
		return  bruttoAr()/mennyiseg;
	}
	public static int osszehassonlit(Kenyer egyik, Kenyer masik) {
		if (egyik.getEgysegar() < masik.getEgysegar()) return -1;
		if (egyik.getEgysegar() > masik.getEgysegar()) return 1;
		return 0;
	}
	

}
