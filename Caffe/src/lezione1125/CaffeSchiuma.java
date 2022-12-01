package lezione1125;

public class CaffeSchiuma extends CaffeDecorator{
	
	private int qtaSchiuma;
	
	public CaffeSchiuma(Caffe caffe, int qtaSchiuma) {
		super(caffe);
		this.qtaSchiuma = qtaSchiuma;
	}

	@Override
	public String prepara() {
		return this.caffe.prepara() + "Ho aggiunto " + qtaSchiuma + " parti di schiuma. ";
	}

}
