package Clases;

import java.util.List;

public class Inventario {

    private List<Producto> listaProductos;

    public Inventario(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void actualizarInventario(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto añadido al inventario: " + producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Producto producto : listaProductos) {
            producto.verDetalles();
        }
    }
}
