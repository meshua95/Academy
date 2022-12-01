package lezione1125;

public class CaffeConZucchero extends CaffeDecorator{
	
	private int qtaZucchero;
	
	public CaffeConZucchero(Caffe caffe, int qtaZucchero) {
		super(caffe);
		this.qtaZucchero = qtaZucchero;
	}

	@Override
	public String prepara() {
		return this.caffe.prepara() + "Ho aggiunto " + qtaZucchero + " cucchiaini di zucchero. ";
	}

}
