package com.example.demo.figure;

public class FiguraFactory {
	public static Figura creaFiguraS() {
		return new Quadrato(20);
	}
	
	public Figura creaFiguraNS() {
		return new Quadrato(20);
	}
}
