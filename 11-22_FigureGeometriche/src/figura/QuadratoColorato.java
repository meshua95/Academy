package figura;

public class QuadratoColorato extends Quadrato implements FiguraColorata {
	
	private String colore;
	
	public QuadratoColorato(double lato, String colore) {
		super(lato);
		this.colore = colore;
	}

	@Override
	public String getColore() {
		return colore;
	}

	@Override
	public void setColore(String colore) {
		this.colore = colore;
	}

}
