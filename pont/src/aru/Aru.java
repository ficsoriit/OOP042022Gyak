package aru;

public class Aru {
	private String nev;
	private int ar;
	private int AFAkulcs;
	public Aru(String nev, int ar, int aFAkulcs) {
		super();
		this.nev = nev;
		this.ar = ar;
		AFAkulcs = aFAkulcs;
	}
	@Override
	public String toString() {
		return "Aru [nev=" + nev + ", ar=" + ar + ", AFAkulcs=" + AFAkulcs + "]";
	}
	
	
	

}
