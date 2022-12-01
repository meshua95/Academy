package lezione1125;

public class Espresso implements Caffe{

	private String miscela;
	
	public Espresso(String miscela) {
		this.miscela = miscela;
	}
	
	@Override
	public String prepara() {
		return "Sto preparando un espresso con miscela " + miscela + ". ";
	}

}
