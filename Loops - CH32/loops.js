/* Loops, bucles, ciclos, como le quieran decir*/
//Ciclo FOR: 

//Incremento: contador de boletos
let boletos = 1;
for (boletos; boletos <= 10; boletos++) {
    console.log(`Boleto número ${boletos}`);
}

let cuentaRegresiva = 10;
for (cuentaRegresiva; cuentaRegresiva >= 1; cuentaRegresiva--) {
    console.log(`Iniciamos en ${cuentaRegresiva}`);
}

//¿Cómo podemos recorrer un array utilizando un ciclo for?
let participantesCH32 = ["Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto", "Ceci", "Albar", "Emmanuel", "Kevin", "Nize", "Paulo", "Johan", "Alberto"];
console.log(participantesCH32);
console.table(participantesCH32);

for (let participante = 0; participante < participantesCH32.length; participante++) {
    console.log(participantesCH32[participante]);
}

for (let participante = participantesCH32.length - 1; participante >= 0; participante--) {
    console.log(participantesCH32[participante]);
}

/*Variaciones del ciclo for:
for...of: nos permite recorrer un array y por cada uno de los elementos nos devuelve el valor.
    for(let element of array){
        //bloque de código
    }
for...in: nos permite recorrer un array, pero nos devuelve su posición.
    for (let elemento if array){
        //bloque de código
    }
*/

let animals = ["Dog", "Cat", "Horse", "Cow", "Lion", "Rabbit", "Bear", "Platypus"];

console.log("--------for...of--------");
for (let animal of animals) {
    console.log(animal);
}

console.log("--------for...in--------");
for (let animal in animals) {
    console.log(animal);
}

//Imprimir los números pares del 1 al 20
for (let cuenta = 1; cuenta <= 20; cuenta++) {
    if (cuenta % 2 === 0) {
        console.log(`Los números pares son ${cuenta}`);
    }
}

//Imprimir la tabla de multiplicar del 8 cuyo output será:
// 8 x 1 = 8 ...
const multiplicando = 8;
for (let i = 1; i <= 10; i++){
    let resultado = multiplicando * i;
    console.log(`${multiplicando} x ${i} = ${resultado}`);
}

//Crear una función que me permita ejecutar cualquier tabla de multiplicar del 1 al 10
function tablaMultiplicar(numero) {
    for (let i = 1; i <= 10; i++){
        let resultado = numero * i;
        console.log(`${numero} x ${i} = ${resultado}`);
    }
}
tablaMultiplicar(2);

//Crear una función flecha que me permita ejecutar cualquier tabla de multiplicar del 1 al 10
const tablaFlecha = (numero) => {
    for (let i = 1; i <= 10; i++){
        let resultado = numero * i;
        console.log(`${numero} x ${i} = ${resultado}`);
    }
}
tablaFlecha(153);

/*------------- CICLO WHILE --------------
El ciclo While recorre un bloque de código siempre que una condición sea verdadera. No conocemos la cantidad de veces que la estructura repetirá las instrucciones, aunque si se puede controlar. 

Sintaxis
while (condition){
    //code block
}
*/

let productos = 10;
while (productos > 0) {
    console.log("Productos vendidos " + productos);
    productos--;
}

//Imprimir los números del 1 al 6 
let numero = 0;
while (numero < 6){
    numero++;
    console.log(numero);
}

let cuenta = 1;
while (cuenta <= 6){
    console.log(cuenta);
    cuenta++;
}

//Utilizando while en un array 
let ropero = ["Chamarra", "Camisa", "Playera", "Bermuda", "Guayabera", "Pantalón", "Falda", "Vestido", "Jogger", "Pants", "Suéter", "Saco", "Jumper"];
let ropa = 0;

while (ropa < ropero.length){
    console.log(ropero[ropa]);
    ropa++;
}

//Crear una secuencia creciente de 5 asteriscos
/*
            *
            **
            ***
            ****
            *****
*/
let num = 5;
let index = 0;
let text = "";

while (index < num){
    text = text + "*";
    console.log(text);
    index++;
}

/*------ Do-While -------- 
En el ciclo Do-While la condición se evalúa después de ejecutar la sentencia, es decir, la sentencia especifica se ejecuta al menos una vez.
Con Do-While lo primero que hacemos es ejecutar las acciones y después preguntar si podemos continuar ejecutando dichas acciones.

Sintaxis
do {
    code block
} while (condition);

*/
//Cuenta del 1 al 6 utilizando Do-While
let numInicial = 1;
do {
    console.log(`Utilizando Do-While ${numInicial}`);
    numInicial++;
} while (numInicial <= 6);

/*----- Control de ciclos ------
- break. Es una sentencia que permite al programa salir. Debe encontrarse anidado dentro del bucle.
- continue. No termina el bucle, sino que salta a la siguiente iteración
*/

//Súper Ozzito. Si eres el cliente número 5, te ganas una coca-cola en bolsita (sentencia continue).
for (let cliente = 1; cliente <= 50; cliente++){
    if (cliente === 5){
        console.log("Eres el cliente número 5, te ganaste una coca-cola en bolsita");
        break;
    }
    console.log(`Cliente número ${cliente}`);
}
