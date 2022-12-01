package test;
import java.util.ArrayList;

import colore.Colore;
import figure.Cerchio;
import figure.Figura;
import figure.FiguraColorata;
import figure.FiguraComposta;
import figure.Quadrato;
import figure.Rettangolo;
import figure.StellaFactory;
import figure.Triangolo;

public class Main {

	public static void main(String[] args) {
		Figura quad = new Quadrato(5);
		System.out.println(quad.toString());
		
		Figura rett = new Rettangolo(5, 3);
		System.out.println(rett.toString());
		
		Figura tri = new Triangolo(5, 3);
		System.out.println(tri.toString());

		FiguraColorata triRosso = new FiguraColorata(tri, new Colore(255, 0, 0));
		System.out.println(triRosso.toString());
		
		FiguraComposta albero = new FiguraComposta(new ArrayList<Figura>());
		albero.add(rett);
		albero.add(new Cerchio(3));
		albero.draw();
		
		FiguraComposta stella5 = StellaFactory.creaStellaDaPunte(5, 8);
		stella5.draw();
		
	}

}
