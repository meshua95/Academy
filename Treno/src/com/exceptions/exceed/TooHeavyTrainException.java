package com.exceptions.exceed;

import com.exceptions.ExceedException;
import com.exceptions.TrenoException;

public class TooHeavyTrainException extends ExceedException {
	String message;

	public TooHeavyTrainException(String sigla, int pesoTrainabile, int pesoTreno) {
		super(sigla);
		this.message = "Il peso totale del treno è di " + pesoTreno + " ma il peso massimo che può trainare il treno è di " + pesoTrainabile + ".";
	}
	public String getMessage() {
		return super.getMessage() + "\n" + this.message;
	}

}
