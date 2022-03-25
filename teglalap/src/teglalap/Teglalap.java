package teglalap;

public class Teglalap {
	private int aoldal;
	private int boldal;
	/* EZ a generalt
	public Teglalap(int aoldal, int boldal) {
		super();
		this.aoldal = aoldal;
		this.boldal = boldal;
	}
	*/
	// Ez a sajat
	public Teglalap (int a, int b) {
		aoldal = a;
		boldal = b;
	}
	
	public Teglalap (int a) {
		/*
		aoldal = a;
		boldal = a;
		*/
		this(a,a);
	}
	
	public int teruletSzamitas() {
		return aoldal*boldal;
	}

	@Override
	public String toString() {
		return "Teglalap [aoldal=" + aoldal + ", boldal=" + boldal + ", terulet=" + teruletSzamitas() + "]";
	}

	/*
	public void setAoldal(int aoldal) {
		this.aoldal = aoldal;
	}

	public void setBoldal(int boldal) {
		this.boldal = boldal;
	}
	*/
	
	public void setOldalak(int a, int b) {
		aoldal = a;
		boldal = b;
	}
	
	public void setOldalak(int a) {
		setOldalak(a,a);
	}
	
	public boolean teruletOsszehasonlito(Teglalap masik) {
		return teruletSzamitas() > masik.teruletSzamitas();
	}

	public boolean egybevago(Teglalap masik) {
		return aoldal == masik.aoldal && boldal == masik.boldal;
	}
	
	
	
	
	

}
