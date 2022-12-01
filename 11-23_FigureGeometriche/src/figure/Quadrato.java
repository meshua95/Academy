package figure;

public class Quadrato extends Rettangolo implements PoligonoRegolare{
	
	public Quadrato(double l) {
		super(l, l);
	}

	@Override
	public double perimetro() {
		return super.getBase() * 4;
	}
	
}
