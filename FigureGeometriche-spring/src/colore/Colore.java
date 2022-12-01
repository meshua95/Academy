package colore;

import java.awt.Color;

public class Colore {
	
	private Color colore;
	
	public Colore(int r, int g, int b) {
		this.colore = new Color(r, g, b);
	}

	public int getR() {
		return colore.getRed();
	}
	
	public int getG() {
		return colore.getGreen();
	}
	
	public int getB() {
		return colore.getBlue();
	}

	@Override
	public String toString() {
		return "Colore [R=" + getR() + ", G()=" + getG() + ", B()=" + getB() + "]";
	}
	
	
}
