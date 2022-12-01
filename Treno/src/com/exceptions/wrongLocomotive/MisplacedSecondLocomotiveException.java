package com.exceptions.wrongLocomotive;

import com.exceptions.WrongLocomotiveException;

public class MisplacedSecondLocomotiveException extends WrongLocomotiveException {
	String message;
	public MisplacedSecondLocomotiveException (String sigla) {
	   	 super(sigla);
	   	 this.message = "Hai inserito la seconda locomotiva in una posizione scorretta: può essere inserita solo in coda!";
	    }
	    public String getMessage() {
	   	 return super.getMessage() + "\n" + this.message;
	    }
}
