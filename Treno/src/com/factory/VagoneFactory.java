package com.factory;

import com.treno.Cargo;
import com.treno.Locomotiva;
import com.treno.Passeggeri;
import com.treno.Ristorante;

public interface VagoneFactory {
	
	public abstract int getMassimoPosti();
	public abstract Locomotiva getLocomotiva();
	public abstract Cargo getCargo();
	public abstract Passeggeri getPasseggeri();
	public abstract Ristorante getRistorante();

}
