package com.exceptions.wrongLocomotive;

import com.exceptions.WrongLocomotiveException;

public class MissingHeadLocomotiveException extends WrongLocomotiveException {
	String message;
  	  
   public MissingHeadLocomotiveException(String sigla) {
		super(sigla);
	  	this.message = "Manca la locomotiva all'inizio!";
		// TODO Auto-generated constructor stub
	}
   
   public String getMessage() {
	  	 return super.getMessage() + "\n" + this.message;
   }
}


