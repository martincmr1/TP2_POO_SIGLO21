/* Apellido y nombre :RUGNIA CARLOS MARTIN
DNI: 28337376 
TP2 : POO 
*/


package Clases;

public class Producto {

    private int id;
    private String nombre;
    private String marca;
    private int talla;
    private String color;
    private double precio;
    private int stock;

    // Constructor
    public Producto(int id, String nombre, String marca, int talla, String color, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para ver los detalles del producto
    public void verDetalles() {
        System.out.println("Producto: " + nombre + ", Marca: " + marca + ", Talla: " + talla + ", Color: " + color + ", Precio: $" + precio + ", Stock: " + stock);
    }

    // Método para actualizar el stock
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        System.out.println("Stock actualizado. Nuevo stock: " + this.stock);
    }

    // Método para obtener el id del producto
    public int getId() {
        return id;
    }

    // Método para obtener la marca del producto
    public String getMarca() {
        return marca;
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Método para obtener el stock del producto
    public int getStock() {
        return stock;
    }
}
