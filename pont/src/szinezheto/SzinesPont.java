package szinezheto;

import java.awt.Color;

public class SzinesPont extends Pont implements Szinezheto {
	private Color szin;
	
	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	public SzinesPont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}
	
	public SzinesPont() {
		super(0, 0);
		this.szin = Szinezheto.alapertelezettSzin;
	}
	
	

	@Override
	public String toString() {
		return "SzinesPont [szin=" + szin  + super.toString() + "]";
	}

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub
		this.szin = szin;
	}

}
