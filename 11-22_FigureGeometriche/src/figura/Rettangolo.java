package figura;

public class Rettangolo implements Figura, Quadrilatero{
	
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public final double area() {
		return base*altezza;
	}
	
	
}
