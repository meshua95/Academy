package figure;

public class Cerchio implements Figura {
	
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double circonferenza() {
		return 2*raggio*Math.PI;
	}
	
	public double area() {
		return Math.pow(raggio, 2)*Math.PI;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
