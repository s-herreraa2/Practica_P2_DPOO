package practica.excepciones;

public class PotenciaException extends Exception{
	
	private int base;
	
	private int exponente;
	
	public PotenciaException(int base, int exponente) {
		this.exponente = exponente;
		this.base = base;
	}
	
	@Override
	public String getMessage() {
		return "el número no puede ser mayor que n";
	}
}
