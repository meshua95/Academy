package com.vagone.FR;

import java.util.Arrays;
import java.util.List;

import com.treno.Ristorante;

public class RistoranteFR implements Ristorante {
	
	private final int numeroTavoliFR=200, pesoFR=200;
	private final int numeroPersoneFR=200;
	private final List<String> menuFR = Arrays.asList("pizza", "pasta", "mandorlino");
	
	

	@Override
	public int getNumeroTavoli() {
		return numeroTavoliFR;
	}

	@Override
	public int getMaxNumeroPersone() {
		return numeroPersoneFR;
	}

	@Override
	public List<String> getMenu() {
		return menuFR;
	}

	@Override
	public int getPeso() {
		return pesoFR;
	}

	@Override
	public String toString() {
		return "RistoranteFR [numeroTavoliFR=" + numeroTavoliFR + ", pesoFR=" + pesoFR + ", numeroPersoneFR="
				+ numeroPersoneFR + ", menuFR=" + menuFR + "]";
	}

	
	
}
