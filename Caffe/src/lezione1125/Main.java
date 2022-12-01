package lezione1125;

public class Main {
	public static void main(String[] args) {
		
		Caffe e = new Espresso("arabica");
		CaffeCacao cc = new CaffeCacao(e, 1); // caffe, quantità di cacao
		CaffeConZucchero cz = new CaffeConZucchero(cc, 1);
		CaffeSchiuma cs = new CaffeSchiuma(cz, 1);
		

		System.out.println(cs.prepara());
		
		// sto preparando un caffe espresso con miscela arabica
		// aggiungo del cacao
		// aggiungo dello zucchero
		// aggiungo della schiuma
	}
}
