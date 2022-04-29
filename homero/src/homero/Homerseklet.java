package homero;

public class Homerseklet {
	
	
	public enum Mertekegyseg {
		CELSIUS,
		KELVIN
	}

	private double homeseklet;
	private Mertekegyseg mertekegyseg;
	public Homerseklet(double homeseklet) {
		super();
		this.homeseklet = homeseklet;
		mertekegyseg = Mertekegyseg.CELSIUS;
	}
	public double getHomeseklet() {
		return homeseklet;
	}
	public void setHomeseklet(double homeseklet) {
		this.homeseklet = homeseklet;
	}
	public Mertekegyseg getMertekegyseg() {
		return mertekegyseg;
	}
	public void setMertekegyseg(Mertekegyseg mertekegyseg) {
		this.mertekegyseg = mertekegyseg;
	}
	@Override
	public String toString() {
		return "Homerseklet [homeseklet=" + homeseklet + ", mertekegyseg=" + mertekegyseg + "]";
	}
	
	public static double konvHomerseklet(Homerseklet homerseklet, Mertekegyseg mertekegyseg) {
		if (homerseklet.getMertekegyseg() == mertekegyseg) {
			return homerseklet.getHomeseklet();
		}
		switch (mertekegyseg) {
		case CELSIUS:
			return homerseklet.getHomeseklet() + 273.15;
		case KELVIN: 
			return homerseklet.getHomeseklet() - 273.15;
		}
		return 0.0;
	}
	
}
