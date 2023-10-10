package org.generation.controlDeFlujo;

import java.util.Scanner;

public class ControlFlujo {
	public static void main(String[] args) {
		/*
		 * Sentencias o declaraciones condicionales.
		 * - if 
		 * - else
		 * - switch
		 * - operador ternario
		 * 
		 * 	if (expresion_logica1){
		 * 		//bloque de código
		 * 	} else if (expresion_logica2){
		 * 		//bloque de código
		 * 	} else {
		 * 		//bloque de código
		 * }
		 */
		
		/*
		 * Ejemplo 1.
		 * Mañana: 6 - 11:59
		 * Tarde: 12 - 18
		 * Noche: 18 - 23:59
		 * Madrugada: 0 - 5:59
		 */
		
		//Determinar el momento del día 
		int time = 0;
		if (time >= 6 && time <12) {
			System.out.println("Es de mañana");
		} else if (time >= 12 && time < 18) {
			System.out.println("Es de tarde");
		} else if (time >= 18 && time < 24) {
			System.out.println("Es de noche");
		} else if (time >= 0 && time < 6){
			System.out.println("Es de madrugada");
		} else {
			System.out.println("No es un número válido");
		}
		
		//Determinar los días de la semana iniciando con lunes 
		/*int day = 8;
		
		if (day ==1) {
			System.out.println("Lunes");
		}else if (day == 2) {
			System.out.println("Martes");
		}else if (day == 3) {
			System.out.println("Miércoles");
		}else if (day == 4) {
			System.out.println("Jueves");
		}else if (day == 5) {
			System.out.println("Viernes");
		} else if (day == 6) {
			System.out.println("Sábado");
		} else if (day == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Número de la semana inválido");
		}*/
		
		/*
		 * Java User Input (Scanner)
		 * La clase Scanner se utiliza para obtener la entrada del usuario y se encuentra en el java.util.package. Hay que importar dicha clase dentro de mi proyecto Java para acceder a él mediante la Java API
		 */
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Escribe tu nombre de usuario");
		
		String userName = scanner.nextLine();
		
		System.out.println("Escribe tu edad");
		
		int age = scanner.nextInt();
		
		System.out.println("Hola " + userName + " bienvenido. Tu edad es de " + age + " años");

		System.out.println("Elige un número correspondiente a la semana, donde 1 es lunes y 7 es domingo");
		
		int day = scanner.nextInt();
		
		if (day ==1) {
			System.out.println("Lunes");
		}else if (day == 2) {
			System.out.println("Martes");
		}else if (day == 3) {
			System.out.println("Miércoles");
		}else if (day == 4) {
			System.out.println("Jueves");
		}else if (day == 5) {
			System.out.println("Viernes");
		} else if (day == 6) {
			System.out.println("Sábado");
		} else if (day == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Número de la semana inválido");
		}
		
		
		/*
		 * switch (variable){
		 * case 1:
		 * 	//bloque de código
		 * 	break;
		 * case 2:
		 * 	//bloque de código
		 * 	break;
		 * case....:
		 * 	//bloque de código
		 * 	default: 
		 * 		//bloque de código
		 * }
		 */
		
		//Crear un programa que solicite al usuario un número entero y muestre en consola los días de la semana. El lunes corresponde al 1, martes al 2, miércoles al 3... domingo al 7 y si no corresponde, escribir un mensaje de advertencia.
		//Crear un programa que solicite al usuario un número entero y muestre en consola el mes correspondiente al año. Enero es 1, febrero es 2, marzo es 3... diciembre es 12 y si no corresponde, escribir un mensaje de advertencia
		//Crear un programa que solicite al usuario un número entero y muestre en consola el mes correspondiente al año y los consecutivos. Enero es 1, febrero es 2, marzo es 3... diciembre es 12 y si no corresponde, escribir un mensaje de advertencia
		
		char aChiquita = 'ª';
		//char -> short
		short asciiAChiquita = (short)aChiquita;
		System.out.println("El valor ascci de: " + aChiquita + " es " + asciiAChiquita);
		
		char valorAChiquita = 170;
		System.out.println(valorAChiquita);
		
		System.out.println("Seleccione un número correspondiente al día de la semana laboral, donde 1 es Lunes hasta 5 es viernes.");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
		case 2:
			System.out.println("Martes");
		case 3:
			System.out.println("Miércoles");
		case 4:
			System.out.println("Jueves");
		case 5:
			System.out.println("Viernes");
			break;
			default:
				System.out.println("Número inválido");
		}
		
		scanner.close();
	}
}
