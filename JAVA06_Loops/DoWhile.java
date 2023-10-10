package org.generation.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * Do-While. Evalúa una expresión en la parte inferior del ciclo. Por lo tanto, las declaración dentro del bloque do se ejecutan al menos una vez.
		 */
		
		//Cuenta del 1 al 10
		/*int numero = 1;
		do {
			System.out.println("La cuenta va en " + numero);
			numero++;
		} while (numero <= 10);*/
		
		int numero = 1;
		do {
			System.out.println("La cuenta va en " + numero);
			numero++;
		} while (numero < 0);
		
		/*
		 * Crear un programa para un cajero bancario.
		 * - El programa mostrará al usuario 4 opciones que puede elegir
		 * 		1. Consultar saldo
		 * 		2. Retiro dinero
		 * 		3. Depositar dinero
		 * 		4. Salir
		 * -Tenemos que interactuar con el usuario y mostrar la opción selecionada
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido. Escribe el número correspondiente a la opción deseada: \n 1. Consultar saldo \n 2. Retirar dinero \n 3. Depositar dinero \n 4. Salir");
		int opcionBanquito;
		
		do {
			 opcionBanquito = sc.nextInt();
			
			switch(opcionBanquito) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Retirar dinero");
				break;
			case 3:
				System.out.println("Depositar dinero");
				break;
			case 4:
				System.out.println("Salir");
				break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		} while (opcionBanquito != 4 );
		
		sc.close();
	}

}
