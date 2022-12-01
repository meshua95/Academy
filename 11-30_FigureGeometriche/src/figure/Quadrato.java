package figure;

public class Quadrato extends Rettangolo implements PoligonoRegolare{
	
	public Quadrato(double lato) {
		super(lato, lato);
	}

	@Override
	public double perimetro() {
		return super.getBase() * 4;
	}
	
}
