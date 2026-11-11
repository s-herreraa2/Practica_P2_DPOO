package practica.excepciones;

public class CeroException extends Exception{
	
	private int base;
	
	private int exponente;
	
	public CeroException(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}
	
	@Override
	public String getMessage() {
		return "no se puede elevar un cero a la cero";
	}
}
