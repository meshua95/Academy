package com.factory;

import com.treno.Cargo;
import com.treno.Locomotiva;
import com.treno.Passeggeri;
import com.treno.Ristorante;
import com.vagone.FR.CargoFR;
import com.vagone.FR.LocomotivaFR;
import com.vagone.FR.PasseggeriFR;
import com.vagone.FR.RistoranteFR;

public class FRFactory implements VagoneFactory {
	
	private int massimoPostiFR=500;
	
	/*
	 * SONO STATI USATI DUE COSTRUTTORI IN MODO DA AVERE UN CASO DI MASSIMO POSTI GIà DEFINITO E UNO DEFINIBILE DALL'UTENTE
	 */
	
	public FRFactory() {
	}

	public FRFactory(int massimoPostiFR) {
		this.massimoPostiFR = massimoPostiFR;
	}

	@Override
	public Locomotiva getLocomotiva() {
		return new LocomotivaFR();
	}

	@Override
	public Cargo getCargo() {
		return new CargoFR();
	}

	@Override
	public Passeggeri getPasseggeri() {
		return new PasseggeriFR();
	}

	@Override
	public Ristorante getRistorante() {
		return new RistoranteFR();
	}

	@Override
	public int getMassimoPosti() {
		return this.massimoPostiFR;
	}


}
