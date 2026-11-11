package practica.consola;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practica.excepciones.CeroException;
import practica.excepciones.ExpNegativoException;
import practica.excepciones.PotenciaException;
import practica.mundo.Potencia;
import practica.persistencia.PersistenciaPotencias;

public class ConsolaPotencia {

	public static void main(String[] args) {
		PersistenciaPotencias persistencia = new PersistenciaPotencias();
		String ruta = "data/historial.json";
		
		List<Potencia> lista;
		try {
		    lista = persistencia.cargar(ruta);
		} catch (IOException e) {
		    lista = new ArrayList<>();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe una base ");
		int base = sc.nextInt();
		
		System.out.print("escribe un exponente ");
		int exponente = sc.nextInt();
		
		try {
			Potencia p = new Potencia (base, exponente);
			int x = p.calcularPotencia();
			System.out.print("Resultado: " + x);
			lista.add(p);
			persistencia.guardar(lista, ruta);
		}
		catch(CeroException e){
			System.out.println("Error: " + e.getMessage() );
		}
		catch(ExpNegativoException e){
			System.out.println("Error: " + e.getMessage() );
		}
		catch(PotenciaException e){
			System.out.println("Error: " + e.getMessage() );
		}
		catch (IOException e) {
		    System.out.println("Error: no se pudo guardar el historial");
		}
	}

}
