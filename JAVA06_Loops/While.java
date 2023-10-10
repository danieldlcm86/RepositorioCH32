package org.generation.loops;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		/*
		 * While. Ejecuta continuamente un bloque de código hasta que se cumpla una condición dada.
		 * 		while(expresion){
		 * 			//Bloque de código
		 * 			//iterador (contador)
		 * 		}
		 */
		
		//Cuenta del 1 al 10
		/*int cuenta = 1;
		while (cuenta <= 10) {
			System.out.println("El número es " + cuenta);
			cuenta++;
		}*/
		
		int cuenta = 0;
		while (cuenta < 10) {
			cuenta++;
			System.out.println("El número es " + cuenta);
		}
		
		/*
		 * Crear un programa que solicite al usuario un número y dicho número será tomado como el valor final de una cuenta
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número que será tomado como el valor final de una cuenta");
		int numeroUsuario = scanner.nextInt();
		
		int contador = 1;
		while (contador <= numeroUsuario) {
			System.out.println("La cuenta va en " + contador);
			contador++;
		}
		
		scanner.close();
		
	}
}
