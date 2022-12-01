package figure;

public class StellaFactory {
	//FACTORY METHOD PATTERN
	public static FiguraComposta creaStellaDaPunte(int punte, double raggio) {
		FiguraComposta x = new FiguraComposta();

		double raggioInterno = raggio/2;
		double baseTriangoli = (new Cerchio(raggioInterno).circonferenza())/punte;
		for(int i=0;i<punte;i++) {
			Triangolo t= new Triangolo(baseTriangoli,(int) (Math.sqrt(3)*baseTriangoli/2));
			x.add(t);
		}
		switch(punte) {
		case 3-> {
			Triangolo t= new Triangolo(baseTriangoli,(int) (Math.sqrt(3)*baseTriangoli/2));
			x.add(t);
		}
		case 4 -> {
			Quadrato q= new Quadrato(baseTriangoli);
			x.add(q);
		}
		case 5 -> {
			Pentagono p= new Pentagono(baseTriangoli);
			x.add(p);
		}

		}
		return x;
	}

	public FiguraComposta creaStellaDaRaggi(int raggio1, int raggio2) {
		FiguraComposta x = new FiguraComposta(null);
		int punte=0;
		int baseTriangoli=0;
		int altezzaTriangolo=0;
		if (raggio1>raggio2) {
			altezzaTriangolo=raggio1-raggio2;
			baseTriangoli=(int) (altezzaTriangolo*2/Math.sqrt(altezzaTriangolo));
			punte=(int) Math.round(raggio2/baseTriangoli);
		}
		else {
			altezzaTriangolo=raggio2-raggio1;
			baseTriangoli=(int) (altezzaTriangolo*2/Math.sqrt(altezzaTriangolo));
			punte=(int) Math.round(raggio1/baseTriangoli);
		}
		for(int i=0;i<punte;i++) {
			Triangolo t= new Triangolo(baseTriangoli,altezzaTriangolo);
			x.add(t);
		}
		switch(punte) {
		case 3 -> {
			Triangolo t= new Triangolo(baseTriangoli,(int) (Math.sqrt(3)*baseTriangoli));
			x.add(t);
		}
		case 4 -> {
			Quadrato q= new Quadrato(baseTriangoli);
			x.add(q);
		}
		case 5 -> {
			Pentagono p= new Pentagono(baseTriangoli);
			x.add(p);
		}

		}
		return x;
	}
}
