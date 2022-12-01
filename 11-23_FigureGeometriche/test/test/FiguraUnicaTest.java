package test;

import figure.FiguraUnica;

public class FiguraUnicaTest {
	
	public static void main(String[] args) {
		FiguraUnica f1 = FiguraUnica.getFiguraUnica();
		FiguraUnica f2 = FiguraUnica.getFiguraUnica();
		
		System.out.println(f1);
		System.out.println(f2);
	}
}
