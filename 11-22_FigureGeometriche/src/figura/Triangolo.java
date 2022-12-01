package figura;

public class Triangolo implements Figura {
	
	private double base;
	private double altezza;
	
	public Triangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double area() {
		return base*altezza/2;
	}

}
