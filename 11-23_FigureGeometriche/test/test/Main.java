package test;
import java.util.ArrayList;
import java.util.List;

import colore.Colore;
import figure.Cerchio;
import figure.Figura;
import figure.FiguraColorata;
import figure.FiguraComposta;
import figure.Quadrato;
import figure.Rettangolo;
import figure.Triangolo;

public class Main {

	public static void main(String[] args) {
		Figura quad = new Quadrato(5);
		System.out.println(quad.toString());
		
		Figura rett = new Rettangolo(5, 3);
		System.out.println(quad.toString());
		
		Figura tri = new Triangolo(5, 3);
		System.out.println(tri.toString());

		FiguraColorata triRosso = new FiguraColorata(tri, new Colore(255, 0, 0));
		System.out.println(triRosso.toString());
		
		List<Figura> albero = new ArrayList<Figura>();
		albero.add(rett);
		albero.add(new Cerchio(3));
		
		FiguraComposta alberoF = new FiguraComposta(albero);
		System.out.print(alberoF.toString());
		
		//Stella stella5 = new Stella(5, 8);
		
	}

}
