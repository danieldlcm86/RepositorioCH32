/*Para definir un proyecto basado en NodeJS, tengo que importar los paquetes desde npm. Para ello, ejecuto el comando
$ npm init -y

Para instalar los paquetes de Colors desde npm ejecutamos el comando (esto viene en la documentación)
$ npm install colors

Tenemos que importar colors en el archivo main.js, mediante una constante
*/
const colors = require('colors');

console.log("Hola, estoy usando colors instalado desde npm con NodeJS".zebra);
console.log("Probando estilos de colors".underline.cyan);
console.log("A ver si es cierto que funciona".rainbow);
console.log("Seguimos probando".rainbow);
console.log("Una prueba de colors".rainbow);
