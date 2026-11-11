package practica.mundo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practica.excepciones.IndiceException;
import practica.excepciones.RadicandoException;

class RaizTest {

	@Test
	void testCasoNormal() throws Exception{
		Raiz r = new Raiz(9, 2);
		double resultado = r.calcularRaiz();
		assertEquals(3, resultado, "la raíz cuadrada de 9 es 3");
	}
	
	@Test
	void testIndiceCero() throws Exception{
		Raiz r = new Raiz(4, 0);
		assertThrows(IndiceException.class, () -> {r.calcularRaiz();});
	}
	
	@Test 
	void testRaizImaginaria() throws Exception{
		Raiz r = new Raiz(-4, 2);
		assertThrows(RadicandoException.class, () -> {r.calcularRaiz();});
	}
	
	@Test
	void testIndNegativo() throws Exception{
		Raiz r = new Raiz(27, 3);
		double resultado = -(r.calcularRaiz());
		assertEquals(-3, resultado, 0.0001);
	}
}
