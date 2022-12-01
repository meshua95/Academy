package figura;

public class RettangoloColorato extends Rettangolo implements FiguraColorata {
	
	private String colore;
	
	public RettangoloColorato(double base, double altezza, String colore) {
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
