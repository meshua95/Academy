package com.factory;

import com.treno.Cargo;
import com.treno.Locomotiva;
import com.treno.Passeggeri;
import com.treno.Ristorante;
import com.vagone.TN.CargoTN;
import com.vagone.TN.LocomotivaTN;
import com.vagone.TN.PasseggeriTN;
import com.vagone.TN.RistoranteTN;

public class TNFactory implements VagoneFactory {
	
	private int massimoPostiTN=1000;
	/*
	 * SONO STATI USATI DUE COSTRUTTORI IN MODO DA AVERE UN CASO DI MASSIMO POSTI GIà DEFINITO E UNO DEFINIBILE DALL'UTENTE
	 */
	public TNFactory() {
	}

	public TNFactory(int massimoPosti) {
		this.massimoPostiTN = massimoPosti;
	}


	@Override
	public Locomotiva getLocomotiva() {
		return new LocomotivaTN();
	}

	@Override
	public Cargo getCargo() {
		return new CargoTN();
	}

	@Override
	public Passeggeri getPasseggeri() {
		return new PasseggeriTN();
	}

	@Override
	public Ristorante getRistorante() {
		return new RistoranteTN();
	}
	
	@Override
	public int getMassimoPosti() {
		return this.massimoPostiTN;
	}
	
	

}
