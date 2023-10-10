package org.generation.logicOperators;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/*
		 * Operadores aritméticos
		 * Operadores relacionales
		 * Operadores lógicos
		 */
		
		//(+, -, *, /, %)
		int num1 = 20;
		int num2 = 2;
		int suma = num1 + num2;
		int modular = num1 % num2;
		System.out.println(suma);
		System.out.println(modular);
		
		// =, +=, -=, *=, /=, ==, !=, <, >, <=, >=
		int num3 = 1;
		int num4 = 1;
		System.out.println(num3 != num4);
		
		//AND(&&), OR (||), NOT (!)
		boolean comparacionUno = num1 == num2;
		System.out.println(comparacionUno);
		
		boolean comparacionDos = (num1 > num2) && (num3 == num4);
		System.out.println(comparacionDos);
		
		boolean comparacionTres = (num1 > num2) || (num3 > num4);
		System.out.println(comparacionTres);
		
		boolean comparacionCuatro = true;
		System.out.println(!comparacionCuatro);
	}
}
