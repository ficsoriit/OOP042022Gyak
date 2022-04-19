package szemelyek;

public class Alkalmazott extends Szemely {
	private String munkahely;
	private int fizetes;
	
	public Alkalmazott(String nev, int kor, String munkahely, int fizetes) {
		super(nev, kor);
		this.munkahely = munkahely;
		this.fizetes = fizetes;
	}

	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}

	public int getFizetes() {
		return fizetes;
	}

	@Override
	public String toString() {
		return "Alkalmazott [munkahely=" + munkahely + ", fizetes=" + fizetes + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
