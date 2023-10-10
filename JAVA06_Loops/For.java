package org.generation.loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		/*
		 * El ciclo, bucle, loop "for" proporciona una forma compacta de iterar sobre valores.
		 * 		for (inicializacion; condicion; iterador){
		 * 			//Bloque de código
		 * 		}
		 */

		//Variable local
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Número es igual a " + numero);
		}
		
		//Variable global
		int contador;
		for (contador = 5; contador >= 1; contador--) {
			System.out.println("Ahora el número es " + contador);
		}
		
		/*
		 * Calcular las primeras 5 potencias de la constante PI y mostrar en consola el valor de cada una de ellas
		 * 	Output:
		 * 	PI elevado a la 1 potencia es igual a 3.141592653589793
		 * 	PI elevado a la 2 potencia es igual a ....
		 */
		double valorPi = Math.PI;
		System.out.println(valorPi);
		
		for(int potencia = 1; potencia <=5; potencia++) {
			double resultado = Math.pow(valorPi, potencia);
			System.out.println("PI elevado a la " + potencia + " es igual a " + resultado);
		}
		
		//Bucles anidados. Mostrar en consola un incremento de asteriscos según el número proporcionado por el usuario.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona un número de filas");
		int numeroFilas = scanner.nextInt();
		
		for (int i = 1; i <= numeroFilas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		scanner.close();
	}
}
