package org.generation.controlDeFlujo;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		/*
		 * Operador ternario. Es una manera de representar una sentencia condicional para evaluar dos condiciones. Si se cumple es true y se ejecuta un bloque de código y si no, es false y se ejecuta otro bloque de código.
		 * variable = (condicion) ? true : false;
		 */
		
		//Solicitar al usuario un número y determinar si es par o impar
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número entero para saber si es par o impar");
		
		int numero = scanner.nextInt();
		
		String par = "par";
		String impar = "impar";
		
		String parImpar = (numero % 2 == 0) ? par: impar;
		System.out.println("El número " + numero + " es " + parImpar);
		
		//Determina si los 3 números enteros solicitados al usuario son pares. Si los 3 números son pares, muestra en consola el texto "tus números son pares", si al menos 1 no es par, muestra en consola el texto "no son pares".
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		String pares = "todos son pares";
		String impares = "no todos los números son pares";
		
		String comparacion = (num1 % 2 == 0) && (num2 % 2 == 0) && (num3 % 2 == 0) ? pares : impares;
		System.out.println("Los números " + num1 + " " + num2 + " " + num3 + " " + comparacion);
		
		scanner.close();
	}
}
