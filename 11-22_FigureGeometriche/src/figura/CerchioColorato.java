package figura;

public class CerchioColorato extends Cerchio implements FiguraColorata {
	
	private String colore;
	
	public CerchioColorato(double raggio, String colore) {
		super(raggio);
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
