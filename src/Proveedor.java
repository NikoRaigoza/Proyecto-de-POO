import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Persona {
    private int idProveedor;
    private String empresa;
    private List<Producto> listaProductos;

    public Proveedor(int idProveedor, String empresa, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.idProveedor = idProveedor;
        this.empresa = empresa;
        this.listaProductos = new ArrayList<>();
    }

    // Agregar un producto al proveedor
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    // Obtener la lista de productos
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    // Getters y Setters
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

