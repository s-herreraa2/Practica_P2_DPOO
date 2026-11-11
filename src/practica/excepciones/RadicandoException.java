package practica.excepciones;

public class RadicandoException extends Exception{
	public int indice;
	public int radicando;
	
	public RadicandoException(int indice, int radicando) {
		this.indice = indice;
		this.radicando = radicando;
	}
	
	@Override
	public String getMessage() {
		return "la raíz de un número menor a cero no está definida en los reales";
	}
}
