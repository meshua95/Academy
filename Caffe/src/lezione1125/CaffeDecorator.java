package lezione1125;

public abstract class CaffeDecorator implements Caffe{
	
	public Caffe caffe;
	
	public CaffeDecorator(Caffe caffe) {
		this.caffe = caffe;
	}
}
