package com.exceptions;

public class TooShortStringException extends TrenoException{
	
	private static final long serialVersionUID = -6411881589510513291L;
	String message;

	public TooShortStringException(String sigla) {
	   	 super(sigla);
	   	 this.message = "La sigla ” +  del treno troppo corta, inserire almeno un'altro vagone";
	   	 
	}
	
	public String getMessage() {
 	      return super.getMessage() + "\n" + this.message;
     }

}
