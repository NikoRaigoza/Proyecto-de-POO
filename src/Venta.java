import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> listaProductos;
    private double total;

    public Venta(int idVenta, Date fecha, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
        this.total = 0.0;
    }

    // Agregar producto a la venta
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        calcularTotal();
    }

    // Calcular el total de la venta
    public void calcularTotal() {
        total = 0;
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
    }

    // Generar factura
    public Factura generarFactura() {
        return new Factura(this);
    }

    // Getters
    public int getIdVenta() {
        return idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public double getTotal() {
        return total;
    }
}

