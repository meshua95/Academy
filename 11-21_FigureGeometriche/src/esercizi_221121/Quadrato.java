package esercizi_221121;

public class Quadrato extends PoligonoRegolare {

	private double lato;
	
	public double area() {
		return lato*lato;
	}
	
	public double perimetro() {
		return lato*4;
	}
}
