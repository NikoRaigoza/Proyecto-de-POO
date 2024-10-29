package proyectoPOO.PuntodeVenta.entity;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Métodos para añadir y encontrar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    // Método para mostrar todos los productos
    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() +
                    ", Precio: " + producto.getPrecio() + ", Stock: " + producto.getStock());
        }
    }
}
