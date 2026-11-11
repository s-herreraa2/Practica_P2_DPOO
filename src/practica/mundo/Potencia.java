package practica.mundo;

import practica.excepciones.CeroException;
import practica.excepciones.ExpNegativoException;
import practica.excepciones.PotenciaException;

public class Potencia {
	
	private int base;
	
	private int exponente;
	
	public Potencia(int base, int exponente) {
		this.exponente = exponente;
		this.base = base;
		
	}
	
	public int calcularPotencia() throws PotenciaException, CeroException, ExpNegativoException {
		if (this.base == 0 && this.exponente == 0) {
			throw new CeroException(this.base, this.exponente);
		}
		else if (this.exponente < 0) {
			throw new ExpNegativoException(this.base, this.exponente);
		}
		else if (Math.pow(this.base, this.exponente) > Integer.MAX_VALUE){
			throw new PotenciaException(this.base, this.exponente);
		}		
		else{
			return (int) Math.pow(this.base, this.exponente);
		}
	}

	public int getBase() {
		return base;
	}

	public int getExponente() {
		return exponente;
	}
}
