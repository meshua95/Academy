package figura;

public abstract class PoligonoRegolare implements Figura{
	
	private double lato;
	private int numLati;
	
	public PoligonoRegolare(double lato, int numLati) {
		this.lato = lato;
		this.numLati = numLati;
	}

	public double perimetro() {
		return lato*numLati;
	}
	
	public double getLato() {
		return lato;
	}
}
