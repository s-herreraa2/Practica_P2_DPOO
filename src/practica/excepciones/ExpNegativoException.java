package practica.excepciones;

public class ExpNegativoException extends Exception{
	
	private int base;
	
	private int exponente;
	
	public ExpNegativoException(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}
	
	@Override
	public String getMessage() {
		return "un exponente negativo no da a lugar un entero";
	}
}
