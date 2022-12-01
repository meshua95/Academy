package com.vagone.FR;

import com.treno.Locomotiva;

public class LocomotivaFR implements Locomotiva {

	private final int potenzaFR=1000;
	private final int pesoFR=100, pesoTrainabileFR=3000;
	

	@Override
	public int getPotenza() {
		return potenzaFR;
	}

	@Override
	public int getPeso() {
		return pesoFR;
	}

	@Override
	public int getPesoTrainabile() {
		return pesoTrainabileFR;
	}

	@Override
	public String toString() {
		return "LocomotivaFR [potenzaFR=" + potenzaFR + ", pesoFR=" + pesoFR + ", pesoTrainabileFR=" + pesoTrainabileFR
				+ "]";
	}

	
}
