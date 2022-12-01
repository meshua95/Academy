package figure;

public class Rettangolo implements Figura, Quadrilatero{
	
	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public final double area() {
		return base*altezza;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getAltezza() {
		return this.altezza;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
