package Clases;

import java.util.ArrayList;

public class Carrito {

    public int idCarrito;
    public ArrayList<Producto> listaProductos;

    public Carrito(int idCarrito) {
        this.idCarrito = idCarrito;
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("******************************");
        System.out.println("Producto agregado al carrito.");
        System.out.println("*******************************");
    }

    public void verCarrito() {

        System.out.println("******************************");
        System.out.println("*Productos en el carrito:*");

        for (Producto producto : listaProductos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
            System.out.println("********************************");
        }
    }

    // Getter para acceder a la lista de productos
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
}
