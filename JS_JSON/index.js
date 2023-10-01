//Object in JS
let pantalon = {
    marca: "Nautica",
    talla: 38,
    precio: 1600,
    color: "azul",
    material: "mezclilla"
}
console.log(pantalon);
console.table(pantalon);

//Object in JSON
let chamarra = `{
    "marca": "Tommy",
    "talla": 34,
    "precio": 2500,
    "color": "azul",
    "material": "mezclilla"
}`
console.log(chamarra);
console.log(typeof(chamarra));

/*-- Serialización y deserialización
*** Serialización. Proceso de convertir un objeto en una secuencia de  bytes o en una cadena de caracteres que pueda ser almacenada o transmitidad. Se realiza para guardar un objeto JS y enviarlo a través de una red o manipularlo en una base de datos.
Object ---> JSON ... 
    JSON.stringify(variable);
*** Deserialización. Proceso de tomar una cadena de caracteres (JSON) y convertirlos en un objeto JS en la memoria.
JSON ---> Object ... 
    JSON.parse(variable);
*/
//Object to JSON
let serializando = JSON.stringify(pantalon);
console.log(serializando);
console.log(typeof(serializando));

//JSON to Object
let deserializando = JSON.parse(chamarra);
console.log(deserializando);
console.log(typeof(deserializando));

//Objetos multidimensionales
let employees = {
    employees: [
        {firstName: "Daniel", lastName: "Maldonado", id: 5423},
        {firstName: "Tania", lastName: "Cruz", id: 6134},
        {firstName: "José Manuel", lastName: "Hernández", id: 1223}
    ]
}
console.log(employees);
console.log(typeof(employees));

//Serializar el Objetos multidimensionales (Object --> JSON)
let employeesToString = JSON.stringify(employees);
console.log(employeesToString);
console.log(typeof(employeesToString));

//Objeto multidimensional JSON
let students = `{
    "students": [
        {"firstName": "Daniel", "lastName": "Maldonado", "id": 5423},
        {"firstName": "Tania", "lastName": "Cruz", "id": 6134},
        {"firstName": "José Manuel", "lastName": "Hernández", "id": 1223}
    ]
}`
console.log(students);
console.log(typeof(students));

//Deserializar el Objetos multidimensionales (JSON --> Object)
let studentsToObject = JSON.parse(students);
console.log(studentsToObject);
console.log(typeof(studentsToObject));