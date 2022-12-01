package com.example.demo.figure;

public class TriangoloEquilatero extends Triangolo implements PoligonoRegolare{

	public TriangoloEquilatero(double base, double altezza) {
		super(base, altezza);
	}
	
	public TriangoloEquilatero(double base) {
		this(base, base*Math.sqrt(3)/2);
	}

	@Override
	public double perimetro() {
		return super.getBase()*3;
	}
	

}
