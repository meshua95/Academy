package figura;

public class Pentagono extends PoligonoRegolare {
	
	private final static double APOTEMA = 0.688;
	
	public Pentagono(double lato) {
		super(lato, 5);
	}

	@Override
	public double area() {
		return APOTEMA*super.getLato();
	}
	
}
