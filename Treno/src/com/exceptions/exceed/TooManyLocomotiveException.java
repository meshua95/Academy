package com.exceptions.exceed;

import com.exceptions.ExceedException;
import com.exceptions.TrenoException;

public class TooManyLocomotiveException extends ExceedException{
	String message;
	public TooManyLocomotiveException(String sigla, int numLocomotive, int maxNumLocomotive) {
	   	 super(sigla);
	   	 this.message = "Hai inserito " + numLocomotive + " locomotive, ma il max è " + maxNumLocomotive + " e può essere inserita solo in testa, se sola, o coda";
	    }
	    public String getMessage() {
	    	return super.getMessage() + "\n" + this.message;
	    }
}
