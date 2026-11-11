package practica.consola;

import java.util.Scanner;

import practica.mundo.Raiz;
import practica.excepciones.*;

public class ConsolaRaiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un índice (raíz n) ");
		int indice = sc.nextInt();
		
		System.out.println("Escriba un radicando (raíz DE m) ");
		int radicando = sc.nextInt();
		
		try {
			Raiz r = new Raiz(radicando, indice);
			double resultado = r.calcularRaiz();
			System.out.println("El resultado es " + resultado);
		}
		catch(IndiceException e){
			System.out.println("Error: " +  e.getMessage());
		}
		catch(RadicandoException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
