package figura;

public class Muratore {

	public double calcolaNumeroMattonelle(Figura mattonella, Figura stanza) {
			return stanza.area()/mattonella.area();
	}
	
	public double posaParquet(Figura stanza, Rettangolo mattonella) {
		return stanza.area()/mattonella.area();
	}
	
	public double posaMosaico(Figura stanza, Quadrato mattonella) {
		return stanza.area()/mattonella.area();
	}

}
