package practica.mundo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practica.excepciones.CeroException;
import practica.excepciones.ExpNegativoException;
import practica.excepciones.PotenciaException;

class PotenciaTest {

	//clase normal q sirve
	@Test
	void testNormal() throws Exception{
		Potencia p = new Potencia(3, 2);
		int resultado = p.calcularPotencia();
		assertEquals(9, resultado, "3^2 da 9");
	}
	
	//0^0
	@Test
	void testCero() throws Exception{
		Potencia p = new Potencia(0, 0);
		assertThrows(CeroException.class, () -> {p.calcularPotencia();});
	}
	
	//exp negativo
	@Test
	void testExp() throws Exception {
		Potencia p = new Potencia(4, -3);
		assertThrows(ExpNegativoException.class, () -> {p.calcularPotencia();});
	}
	
	//límite dentro de integer max
	@Test
	void testNumGrande() throws Exception {
		Potencia p = new Potencia(2, 30);
		assertEquals(1073741824, p.calcularPotencia());
	}
	
	//coso q se salga
	@Test
	void testMayoraIntMax() throws Exception {
		Potencia p = new Potencia(2, 31);
		assertThrows(PotenciaException.class, () -> {p.calcularPotencia();});
	}
}
