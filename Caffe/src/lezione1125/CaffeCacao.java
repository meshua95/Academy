package lezione1125;

public class CaffeCacao extends CaffeDecorator{
	
	private int qtaCacao;
	
	public CaffeCacao(Caffe caffe, int qtaCacao) {
		super(caffe);
		this.qtaCacao = qtaCacao;
	}

	@Override
	public String prepara() {
		return this.caffe.prepara() + "Ho aggiunto " + qtaCacao + " parti di cacao. ";
	}

}
