//Para heredar de una superclase se indica que esta subclase (MobilePhone) hereda de la superclase (Products) y por ello utilizamos la palabra reservada extends, seguido del nombre de la superclase
class MobilePhone extends Products {
    modelo = "";

    //Para llamar los argumentos del constructor de la superclase, utilizo la palabra reservada super y dentro de ella los argumentos heredados
    constructor(nombre, precio, stock, modelo){
        super(nombre, precio, stock);
        this.modelo = modelo;
    }

    //Métodos específicos para MobilePhone
    encender(){
        return `Bienvenido ${this.nombre} (${this.modelo})`;
    }

    descripcion(){
        return `${this.nombre} ${this.modelo} tiene un costo de ${this.precio} pesos mexicanos. En inventario se encuentran ${this.stock} piezas`;
    }
}

//Instanciar los objetos
let mobilePhone1 = new MobilePhone("Iphone", 23999, 214, "15 Pro Max");
let mobilePhone2 = new MobilePhone("Samsung", 21999, 139, "Galaxy s23+");

//---- Utilizar métodos específicos -----
console.log(mobilePhone1.encender());
console.log(mobilePhone2.encender());
console.log(mobilePhone1.descripcion());
console.log(mobilePhone2.descripcion());

//---- Implementando métodos heredados ----
let cantidadComprada = 2;

//Daniel compra 2 iphone
const costoTotalCompra = mobilePhone1.calcularPrecioTotal(cantidadComprada);
console.log(`El total de ${cantidadComprada} ${mobilePhone1.nombre} ${mobilePhone1.modelo} es de $${costoTotalCompra}`);

//Costo total de los 2 iphone con descuento
const precioDescuento = mobilePhone1.precioDescuento(costoTotalCompra);
console.log(`El precio con descuento de ${cantidadComprada} ${mobilePhone1.nombre} ${mobilePhone1.modelo} es de $${precioDescuento}`);