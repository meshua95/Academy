package esercizi_221121;

public class Cerchio extends Figura {
	
	private double raggio;
	
	public Cerchio(double r) {
		raggio = r;
	}
	
	public double area() {
		return Math.pow(raggio, 2)*Math.PI;
	}
}
