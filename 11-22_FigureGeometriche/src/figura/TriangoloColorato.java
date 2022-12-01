package figura;

public class TriangoloColorato extends Triangolo implements FiguraColorata {
	
	private String colore;
	
	public TriangoloColorato(double base, double altezza, String colore) {
		super(base, altezza);
		this.colore = colore;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}

}
