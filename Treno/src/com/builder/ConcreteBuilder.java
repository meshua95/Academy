package com.builder;

import com.factory.VagoneFactory;
import com.treno.Cargo;
import com.treno.Locomotiva;
import com.treno.Passeggeri;
import com.treno.Ristorante;

public class ConcreteBuilder extends TrenoBuilder{
	private VagoneFactory factory;
	
	public ConcreteBuilder(VagoneFactory vagoneFactory) {
		this.factory = vagoneFactory;
	}

	@Override
	public Locomotiva getLocomotiva() {
		return factory.getLocomotiva();

	}

	@Override
	protected Passeggeri getPasseggeri() {
		return factory.getPasseggeri();
	}

	@Override
	protected Cargo getCargo() {
		return factory.getCargo();
	}

	@Override
	protected Ristorante getRistorante() {
		return factory.getRistorante();
	}

	@Override
	protected int getMassimoPosti() {
		return factory.getMassimoPosti();
	}

		
	
	 
}
