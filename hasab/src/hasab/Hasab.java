package hasab;

public abstract class Hasab {
	private int magassag;

	public Hasab(int magassag) {
		super();
		this.magassag = magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract double alapterulet();
	
	public double terfogat( ) {
		return alapterulet() * magassag;
	}
	
	public boolean nagyobbE(Henger masik) {
		return terfogat() > masik.terfogat();
	}
}
