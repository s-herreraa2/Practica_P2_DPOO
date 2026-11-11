package practica.mundo;

import practica.excepciones.IndiceException;
import practica.excepciones.RadicandoException;

public class Raiz {
	private int indice;
	private int radicando;
	
	public Raiz(int radicando, int indice) {
		this.indice = indice;
		this.radicando = radicando;
	}

	public int getIndice() {
		return indice;
	}

	public int getRadicando() {
		return radicando;
	}
	
	public double calcularRaiz() throws IndiceException, RadicandoException{
		//casos de excepción: indice=0, radicando <0 cuando indice es par
		if (this.indice == 0) {
			throw new IndiceException(this.indice, this.radicando);
		}
		else if (this.indice % 2 == 0 && this.radicando < 0) {
			throw new RadicandoException(this.indice, this.radicando);
		}
		else {
			return Math.pow(this.radicando, 1.0/this.indice);
		}
	}
}
