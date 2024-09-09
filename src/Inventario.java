import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> listaProductos;
    private int capacidadMaxima;
    private String ubicacionAlmacen;

    public Inventario(int capacidadMaxima, String ubicacionAlmacen) {
        this.listaProductos = new ArrayList<>();
        this.capacidadMaxima = capacidadMaxima;
        this.ubicacionAlmacen = ubicacionAlmacen;
    }

    //Agregar y eliminar productos
    public void agregarProducto(Producto producto) {
        if (listaProductos.size() < capacidadMaxima) {
            listaProductos.add(producto);
        } else {
            System.out.println("El inventario está lleno");
        }
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }

    public Producto consultarProducto(int idProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }
}

