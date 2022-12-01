package com.example.demo.figure;

import com.example.demo.colore.Colore;

public class FiguraColorata extends FiguraDecorator {
	
	private Colore colore;
	
	public FiguraColorata(Figura figura, Colore colore) {
		super(figura);
		this.colore = colore;
	}
	
	public Colore getColore() {
		return colore;
	}

	@Override
	public void myDraw() {
		System.out.println("FiguraConBordi [colore=" + colore + "]");
	}

}
