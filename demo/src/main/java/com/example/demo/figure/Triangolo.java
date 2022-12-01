package com.example.demo.figure;

public class Triangolo implements Figura {
	
	private double base;
	private double altezza;
	
	public Triangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double area() {
		return base*altezza/2;
	}
	
	public double getBase() {
		return base;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
