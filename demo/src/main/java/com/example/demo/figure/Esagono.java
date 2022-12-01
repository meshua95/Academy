package com.example.demo.figure;

public class Esagono implements PoligonoRegolare {
	
	private final static int NUM_LATI = 6;
	private final static double APOTEMA = 0.866;
	
	private double lato;
	
	public Esagono(double lato) {
		this.lato = lato;
	}

	@Override
	public double area() {
		return APOTEMA*lato;
	}
	
	@Override
	public double perimetro() {
		return lato*NUM_LATI;
	}

	@Override
	public void draw() {
		System.out.println("Esagono [lato=" + lato + ", perimetro=" + perimetro() + ", area()=" + area() + "]");
	}

	
}
