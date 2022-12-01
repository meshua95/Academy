package figure;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposta implements Figura{
	
	private List<Figura> figure;
	
	public FiguraComposta(List<Figura> figura) {
		this.figure = figura;
	}
	
	public FiguraComposta() {
		this(new ArrayList<Figura>());
	}
	
	public void add(Figura figura) {
		figure.add(figura);
	}
	
	@Override
	public double area() {
		double area = 0;
		for(Figura f: figure) {
			area += f.area();
		}
		return area;
	}

	@Override
	public void draw() {
		System.out.println("FiguraComposta [figure=" + figure + ", area()=" + area() + "]");
	}
	
	

}
