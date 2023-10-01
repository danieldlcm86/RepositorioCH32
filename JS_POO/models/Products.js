//Crear una clase llamada Products, con 4 atributos (nombre(String), precio(Number), stock(Number), cantidad(Number)), con constructor y con dos métodos (calcularPrecioTotal y descuento)
class Products {
    //Propiedades o atributos como variable
    nombre = "";
    precio = 0;
    stock = 0;

    //Constructor
    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Métodos
    calcularPrecioTotal(cantidad) {
        return cantidad * this.precio;
    }

    //Quiero definir un descuento del 20% (0.2)
    precioDescuento(calcularPrecioTotal){
        return calcularPrecioTotal - (calcularPrecioTotal * 0.2);
    }
}
