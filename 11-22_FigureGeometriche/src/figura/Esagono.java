package figura;

public class Esagono extends PoligonoRegolare {
	

	private final static double APOTEMA = 0.866;
	
	public Esagono(double lato) {
		super(lato, 6);
	}

	@Override
	public double area() {
		return APOTEMA*super.getLato();
	}
	
}
