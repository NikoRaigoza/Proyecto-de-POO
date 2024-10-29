package proyectoPOO.PuntodeVenta.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    // Constructor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos para agregar productos al pedido
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getStock() >= cantidad) {
            productos.add(producto);
            total += producto.getPrecio() * cantidad;
            producto.reducirStock(cantidad);
        } else {
            System.out.println("No hay suficiente stock para el producto: " + producto.getNombre());
        }
    }

    public double getTotal() {
        return total;
    }

    // Método para mostrar los detalles del pedido
    public void mostrarDetalles() {
        System.out.println("Pedido de: " + cliente.getNombre());
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + " - Precio: " + producto.getPrecio());
        }
        System.out.println("Total a pagar: " + total);
    }
}