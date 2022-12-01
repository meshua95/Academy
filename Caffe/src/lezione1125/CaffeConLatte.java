package lezione1125;

public class CaffeConLatte extends CaffeDecorator{
	
	private int qtaLatte;
	
	public CaffeConLatte(Caffe caffe, int qtaLatte) {
		super(caffe);
		this.qtaLatte = qtaLatte;
	}

	@Override
	public String prepara() {
		return this.caffe.prepara() + "Ho aggiunto " + qtaLatte + " parti di latte. ";
	}

}
