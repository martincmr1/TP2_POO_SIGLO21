/* Apellido y nombre :RUGNIA CARLOS MARTIN
DNI: 28337376 
TP2 : POO 
*/


package Clases;

public class Pago {

    private int idPedido;
    private String metodoPago;
    private double monto;

    public Pago(int idPedido, String metodoPago, double monto) {
        this.idPedido = idPedido;
        this.metodoPago = metodoPago;
        this.monto = monto;
    }

    public boolean procesarPago() {
        System.out.println("Procesando pago de $" + monto + " con " + metodoPago);
        return true; // Simula un pago exitoso
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado para el pedido: " + idPedido);
    }
}
