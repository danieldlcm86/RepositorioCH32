package org.generation.dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		System.out.println("Tipos de datos");
		/*
		 *Datos primitivos. Datos fundamentales de Java que sirven para gestionar los tipos de información más básicos. Existen 8 tipos de datos primitivos: byte, short, int, long, flout, double, char y boolean 
		 */
		
		//byte. Vmin y Vmax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor mínimo de un byte es: " + minByte);
		System.out.println("El valor máximo de un byte es: " + maxByte);
		
		//short. Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//int. Vmin y VMax
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de un int es: " + minInt);
		System.out.println("El valor máximo de un int es: " + maxInt);
		
		//long. Vmin y VMax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de un long es: " + minLong);
		System.out.println("El valor máximo de un long es: " + maxLong);
		
		//float. Vmin y VMax
		float minFloat = Float.MIN_VALUE;
		float maxFLoat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de un float es: " + minFloat);
		System.out.println("El valor máximo de un float es: " + maxFLoat);
		
		//double. Vmin y VMax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de un double es: " + minDouble);
		System.out.println("El valor máximo de un double es: " + maxDouble);
		
		//char. Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
		
		//Tipos de datos que necesitan una anotación especial
		//long
		long isbn = 9354218265324L;
		System.out.println("El isbn de Harry Potter y el cáliz de fuego es " + isbn);
		//float
		float salary = 20255.83f;
		//double
		double isr = 1436.70d;
		System.out.println("El salario de Emmanuel es de $" + salary + " y le descuentan $" + isr + " impuestos");
		
		//char
		char valorChar1 = 170;
		char valorChar2 = 52;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char nuevoChar1 = 'M';
		System.out.println(nuevoChar1);
		
		/*
		 * Casteo de tipos. Conversión de tipos de datos primitivos en Java.
		 * - Automático (dato más pequeño a un dato más grande)
		 * - Manual (dato más grande a uno más pequeño)
		 */
		
		int myNumber = 135;
		// casting de int a double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short age = 28;
		// casting de short a int
		int myAge = age;
		System.out.println(myAge);
		
		//Convertir de float a int
		float myFloat = 5.8f;
		// float -> int
		int newFloat = (int)myFloat;
		System.out.println(newFloat);
		
		//Obtener el valor ASCII de un char
		char caracter = 'ª'; 
		int representacion = (int) caracter; 
		System.out.println("El valor ASCII es: " + representacion);
	}
}
