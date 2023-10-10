package org.generation.loops;

public class BreakContinue {
	public static void main(String[] args) {
		/*
		 * Sentencias utilizadas en loops:
		 * - Break. Se utiliza para salir de un ciclo en un punto específico
		 * - Continue. Interrumpe la iteración de un bucle, pero continúa con la siguiente iteración
		 */
		
		//Súper-ozzito va a realizar una rifa para sus primeros 50 clientes. El cliente número 5 se gana unos takis fuego y unos frijoles bayos de sobre
		//Con break, finaliza el bucle al llegar a la condición
		for (int cliente = 1; cliente <= 50; cliente++) {
			if (cliente == 5) {
				System.out.println("Eres el cliente número " + cliente +  " y te has ganado unos takis fuego y unos frijoles bayos de sobre.");
				break;
			}
			System.out.println("Cliente: " + cliente);
		}
		
		//Con continue, ejecuta una instrucción específica, pero no sale del programa, continúa el ciclo
		for (int cliente = 1; cliente <= 50; cliente++) {
			if (cliente == 5) {
				System.out.println("Eres el cliente número " + cliente +  " y te has ganado unos takis fuego y unos frijoles bayos de sobre.");
				continue;
			}
			System.out.println("Cliente: " + cliente);
		}
	}
}
