package org.generation.dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan valores, caracteres o datos de tipo primitivo. Entre ellos tenemos:
		 * - String.
		 * - Arrays.
		 * - Objects (del usuario o de la Java API).
		 */
		
		String myString = "Hola soy un String";
		System.out.println(myString);
		
		String myNewString = new String("Hola soy otro String creado como objeto");
		System.out.println(myNewString);
		
		/*
		 * Métodos en String
		 */
		String texto = "qWerTy";
		//lenght.Método que me permite conocer la longitud de un String
		System.out.println(texto.length());
		//toUpperCase() y toLowerCase()
		System.out.println("Aplicando el método toUpperCase(): " + texto.toUpperCase() + " ...aplicando el método toLowerCase(): " + texto.toLowerCase());
		//indexOf(). Devuelve el índice de la primera aparición de un texto específico
		String fraseMotivacional = "Donde pisa leona, no deja huella una gata";
		int metodoIndexOf = fraseMotivacional.indexOf("leona");
		System.out.println(metodoIndexOf);
		
		//Concatenación
		String firstName = "Daniel ";
		String lastName = "Maldonado";
		//System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		
		//Métodos de conversión (parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de " + presupuesto + " y es de tipo " + presupuesto.getClass().getSimpleName());
		
		// String -> int
		int stringParseado = Integer.parseInt(presupuesto);
		System.out.println("El nuevo presupuesto es de: " + stringParseado + " y es de tipo " + ((Object)stringParseado).getClass().getSimpleName() );
		
		/*
		 * Arrays.
		 * tipoDeDato[] nombreArray = {valor1, valor2, valor3...};
		 */
		String[] ch32 = {"Tania", "Antonio", "Elizabeth", "Irving", "Gonzalo"};
		System.out.println(ch32);
		
		/*
		 * Variables constantes o finales
		 */
		final int IVA = 16;
		System.out.println("El valor del iva es del " + IVA + " %" );
		
		//Variable dinámicas
		int ingresos = 23000;
		System.out.println("Mis ingresos son de $" + ingresos);
		ingresos = 25000;
		System.out.println("Mi nuevo salario es de $" + ingresos);
		
	}
}
