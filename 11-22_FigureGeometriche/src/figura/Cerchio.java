package figura;

public class Cerchio implements Figura {
	
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double area() {
		return Math.pow(raggio, 2)*Math.PI;
	}
}
