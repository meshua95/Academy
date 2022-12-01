package figure;

public class FiguraConBordo extends FiguraDecorator {
	
	private double spessoreBordo;
	
	public FiguraConBordo(Figura figura, int spessoreBordo) {
		super(figura);
	}
	
	public double getSpessore() {
		return this.spessoreBordo;
	}

	@Override
	public void myDraw() {
		System.out.println("FiguraConBordi [spessoreBordo=" + spessoreBordo
				+ ", area()=" + area() + "]");
	}

}
