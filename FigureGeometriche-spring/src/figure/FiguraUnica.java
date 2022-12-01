package figure;

public class FiguraUnica {

	private static FiguraUnica figura = null;
	
	private FiguraUnica() {
	}
	
	public static FiguraUnica getFiguraUnica() {
		if(figura == null) {
			figura = new FiguraUnica();
		}
	
		return figura;
	}
}
