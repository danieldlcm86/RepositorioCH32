//-- Objetos en JS
let churrumais = {
    nombre: "Churrumais",
    edad: 5,
    color: "Napolitano",
    caracter: "Agresivo",
    raza: "Persa"
}
//console.log(churrumais);

let garfield = {
    nombre: "Garfield",
    edad: 1,
    color: "Naranja",
    caracter: "Pasivo",
    raza: "Himalayo"
}
//console.log(garfield);

let salem = {
    nombre: "Salem",
    edad: 1000,
    color: "Negro",
    caracter: "Sarcástico",
    raza: "Bombay"
}
//console.log(salem);

console.log(`El tipo de dato del primer gato es ${typeof(churrumais)}`);

let obtenerNombre = garfield.nombre;
console.log(`El nombre del segundo gato es ${obtenerNombre}`);

console.log(`El carácter del gato ${salem.nombre} es ${salem.caracter}`);

/*Para agilizar el proceso de instancia de objetos, recurrimos a clases
-- Orden general para crear una Clase.
    1. Crear la clase y Nombrar la clase utilizando PascalCase
    2. Atributos o propiedades.
    3. Constructores
    4. Métodos o comportamientos (funciones)
*/

//1. Crear class Gato
class Gato {
    //2. Definir atributos o propiedades de los objetos
    nombre = "";
    edad = 0;
    color = "";
    caracter = "";
    raza = "";

    //3. Constructores. Función especial para construir los parámetros que voy a asignar al objeto
    constructor(nombre, edad, color, caracter, raza){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.caracter = caracter;
        this.raza = raza;
    }

    //4. Métodos o comportamientos definidos como funciones
    pelear(){
        console.log("Pelea en las láminas");
    }

    comer(){
        console.log("Karen, dame comida");
    }

    maullar(){
        console.log("¡Rayos!, ya son las 3 de la madrugada, hora de maullar");
    }
}

//Instanciar objetos (crear objetos).
let gatito1 = new Gato("Rudy", 14, "naranja", "encantador", "Carey");
let gatito2 = new Gato("Pelusa", 5, "gris", "rudo", "Azul Ruso");
let gatito3 = new Gato("Oreo", 9, "blanco con negro", "amigable", "Taby");
let gatito4 = new Gato("Morgana", 2, "negro", "curiosos", "Americano pelo corto");

console.log(gatito1);
console.log(`${gatito1.nombre} tiene ${gatito1.edad} años`);

gatito2.maullar();

console.log(`${gatito3.nombre} es un gatito muy ${gatito3.caracter}`);