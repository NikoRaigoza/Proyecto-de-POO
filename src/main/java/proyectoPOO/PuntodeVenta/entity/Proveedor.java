package proyectoPOO.PuntodeVenta.entity;

public class Proveedor extends Persona {
    private String idProveedor;

    // Constructor
    public Proveedor(String idProveedor, String nombre, String telefono, String direccion, String email) {
        super(nombre, direccion, telefono, email);
        this.idProveedor = idProveedor;
    }

    // Getters
    public String getId() {
        return idProveedor;
    }
}
