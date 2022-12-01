package figura;

import java.util.List;

public class FiguraComposta {
	
	private List<Figura> figure;
	
	public FiguraComposta(List<Figura> figura) {
		this.figure = figura;
	}
	
	public double area() {
		double area = 0;
		for(Figura f: figure) {
			area += f.area();
		}
		return area;
	}

}
