/* Apellido y nombre :RUGNIA CARLOS MARTIN
DNI: 28337376 
TP2 : POO 
*/
import java.util.ArrayList;
import java.util.Scanner;
import Clases.*;

public class ECommerce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;
        Carrito carrito = null;

        // Muestra los productos disponibles
        ArrayList<Producto> listaProductosDisponibles = new ArrayList<>();
        listaProductosDisponibles.add(new Producto(1, "Zapatilla Deportiva", "Nike", 42, "Negro", 320000.50, 10));
        listaProductosDisponibles.add(new Producto(2, "Zapatilla Running", "Adidas", 40, "Blanco", 150000.60, 15));
        listaProductosDisponibles.add(new Producto(3, "Zapatilla Casual", "Puma", 41, "Azul", 210000.80, 8));
        listaProductosDisponibles.add(new Producto(4, "Zapatilla de Basquet", "Jordan", 44, "Rojo", 350000.60, 5));
        listaProductosDisponibles.add(new Producto(5, "Zapatilla Skate", "Vans", 43, "Negro", 410000.80, 12));
        listaProductosDisponibles.add(new Producto(6, "Zapatilla de Trekking", "Salomon", 42, "Verde", 125650.90, 6));
        listaProductosDisponibles.add(new Producto(7, "Zapatilla de Futbol", "Nike", 39, "Amarillo", 388000.40, 10));
        listaProductosDisponibles.add(new Producto(8, "Zapatilla Retro", "Reebok", 40, "Blanco", 110000.75, 7));
        listaProductosDisponibles.add(new Producto(9, "Zapatilla de CrossFit", "Under Armour", 41, "Negro", 165000.10, 4));
        listaProductosDisponibles.add(new Producto(10, "Zapatilla de Correr", "New Balance", 42, "Gris", 180000.25, 9));
        // Menú
        while (true) {
            System.out.println("-----------------------");
            System.out.println("----- Deport Line -----");
            System.out.println("-----------------------");
            System.out.println("1. Registrate");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Ver productos disponibles");
            System.out.println("4. Agregar producto al carrito");
            System.out.println("5. Ver carrito");
            System.out.println("6. Realizar pedido");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            // Lógica de las opciones del menú
            switch (opcion) {
                case 1:
                    // Registro del usuario
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese su contrasenia: ");
                    String contrasena = scanner.nextLine();
                    usuario = new Usuario(1, nombre, email, contrasena);
                    usuario.registrar();
                    carrito = new Carrito(1);
                    break;

                case 2:
                    // Inicio de sesión
                    if (usuario == null) {
                        System.out.println("********************************************");
                        System.out.println("*****Primero debes registrar un usuario.*****");
                        System.out.println("********************************************");
                    } else {
                        System.out.print("Ingrese su email: ");
                        String emailLogin = scanner.nextLine();
                        System.out.print("Ingrese su contrasenia: ");
                        String contrasenaLogin = scanner.nextLine();
                        usuario.iniciarSesion(emailLogin, contrasenaLogin);
                    }
                    break;

                case 3:
                    // Ver productos disponibles
                    System.out.println("Productos disponibles:");
                    for (Producto producto : listaProductosDisponibles) {
                        System.out.println(producto.getId() + ". " + producto.getNombre() + " - " + producto.getMarca() + " - $" + producto.getPrecio());
                    }
                    break;

                case 4:
                    // Agregar producto al carrito
                    if (carrito != null) {
                        System.out.print("Ingrese el numero del producto a agregar: ");
                        int productoId = scanner.nextInt();
                        scanner.nextLine();

                        boolean productoEncontrado = false;
                        for (Producto producto : listaProductosDisponibles) {
                            if (producto.getId() == productoId) {
                                carrito.agregarProducto(producto);
                                productoEncontrado = true;
                                break;
                            }
                        }

                        if (!productoEncontrado) {
                            System.out.println("***********************");
                            System.out.println("Producto no encontrado.");
                            System.out.println("***********************");
                        }
                    } else {
                        System.out.println("**************************************");
                        System.out.println("*****Debe iniciar sesion primero.*****");
                        System.out.println("**************************************");
                    }
                    break;

                case 5:
                    // Ver carrito
                    if (carrito != null) {
                        carrito.verCarrito();
                    } else {
                        System.out.println("**************************************");
                        System.out.println("*****Debe iniciar sesion primero.*****");
                        System.out.println("**************************************");
                    }
                    break;
                case 6:
                    // Realizar pedido
                    if (carrito != null && !carrito.getListaProductos().isEmpty()) {
                        double totalPedido = 0;
                        for (Producto producto : carrito.getListaProductos()) {
                            totalPedido += producto.getPrecio();
                        }

                        Pedido pedido = new Pedido(1, 1, carrito.getListaProductos(), totalPedido);
                        pedido.realizarPago();
                        System.out.println("Total del pedido: $" + totalPedido);
                    } else {
                        System.out.println("**************************************");
                        System.out.println("*****El carrito esta vacio.*****");
                        System.out.println("**************************************");
                    }
                    break;

                case 7:
                    // Salir
                    System.out.println("*********************************************");
                    System.out.println("*****Gracias por tu compra.*****");
                    System.out.println("*********************************************");
                    System.exit(0);

                default:
                    System.out.println("*********************************************");
                    System.out.println("*****Opcion no valida. Intente de nuevo.*****");
                    System.out.println("*********************************************");
            }
        }
    }
}
