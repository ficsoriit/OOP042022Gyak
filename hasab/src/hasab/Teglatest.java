package hasab;

public class Teglatest extends Hasab{
	private double szelesseg;
	private double melyseg;
	
	public Teglatest(int magassag, double szelesseg, double melyseg) {
		super(magassag);
		this.szelesseg = szelesseg;
		this.melyseg = melyseg;
	}

	@Override
	public double alapterulet() {
		// TODO Auto-generated method stub
		return szelesseg * melyseg;
	}

	@Override
	public String toString() {
		return "Teglatest [szelesseg=" + szelesseg + ", melyseg=" + melyseg + ", magassag()=" + getMagassag()
				+ ", terfogat=" + terfogat() + "]";
	}

	
	
}
