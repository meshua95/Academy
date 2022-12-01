package com.vagone.FR;

import com.treno.Passeggeri;

public class PasseggeriFR implements Passeggeri{
	
	private final int numeroPostiFR = 100, postiDisabiliFR = 10, pesoFR = 250;

	@Override
	public int getNumeroPosti() {
		return numeroPostiFR;
	}

	@Override
	public int getPostiDisabili() {
		return postiDisabiliFR;
	}

	@Override
	public int getPeso() {
		return pesoFR;
	}

	@Override
	public String toString() {
		return "PasseggeriFR [numeroPostiFR=" + numeroPostiFR + ", postiDisabiliFR=" + postiDisabiliFR + ", pesoFR="
				+ pesoFR + "]";
	}

	

}
