package com.example.demo.figure;

public abstract class FiguraDecorator implements Figura{
	
	protected Figura figura;
	
	public FiguraDecorator(Figura figura) {
		this.figura = figura;
	}
	
	@Override
	public final double area() {
		return figura.area();
	}
	
	public final void draw() {
		this.figura.draw();
		myDraw();
	}
	
	public abstract void myDraw();

}
