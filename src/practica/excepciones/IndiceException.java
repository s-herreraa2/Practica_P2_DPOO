package practica.excepciones;

public class IndiceException extends Exception{
	private int indice;
	private int radicando;
	
	public IndiceException(int indice, int radicando) {
		this.indice = indice;
		this.radicando = radicando;
	}
	
	@Override
	public String getMessage() {
		return "el índice debe ser diferente a 0";
	}
}
