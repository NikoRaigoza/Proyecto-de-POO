import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private int idCliente;
    private List<Venta> historialCompras;

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.idCliente = idCliente;
        this.historialCompras = new ArrayList<>();
    }

    // Agregar una compra al historial
    public void agregarCompra(Venta venta) {
        historialCompras.add(venta);
    }

    // Obtener el historial de compras
    public List<Venta> getHistorialCompras() {
        return historialCompras;
    }

    // Getter y Setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

