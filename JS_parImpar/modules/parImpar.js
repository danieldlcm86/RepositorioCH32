/* Los módulos nos permiten ejecutar las funciones, métodos, ciclos, sentencias, etc., necesarias para que nuestro proyecto de node puede ser ejecutado mediante la exportación de dichos módulos. El punto de entrada (main) importa dichos módulos y ejecuta desde el entorno de NodeJS. */

//Vamos a crear una función que nos determine si un número es par o es impar
export default function determinarParImpar(numero){
    (numero % 2 === 0) ? console.log(`El número ${numero} es "par"`) : console.log(`El número ${numero} es "impar"`);
}
