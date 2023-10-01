//Callback. Función que se ejecuta como argumento o parámetro

function calc(x, y, operation, callback){
    let result;

    switch (operation){
        case 'add':
            result = x + y;
            break;
        case 'substract':
            result = x - y;
            break;
        case 'multiply':
            result = x * y;
            break;
        default:
            result = 'Op not valid';
            break;
    }
    callback(result);
}

function logResult(value){
    console.log(`Result: ${value}`);
}

/*
calc(100, 50, 'add', logResult);
calc(100, 50, 'substract', logResult);
calc(100, 50, 'multiply', logResult);
*/

/*-------- SetTimeOut ---------
Permite determinar los milisegundos para ejecución de un código
*/
function getUser(){
    console.log(`Welcome, danieldlcm86`);
}

//Recibe la función y el tiempo en milisegundos
setTimeout(getUser, 5000);

console.log("Waiting for user info");

//setTimeout + callback + función anónima (refactorización)
setTimeout(() => console.log(`Welcome, barney98`), 3000);