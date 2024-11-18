package proyectoPOO.PuntodeVenta.entity;

public class Proveedor extends Persona implements Identificable {
    private String idProveedor;

    public Proveedor(String idProveedor, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.idProveedor = idProveedor;
    }

    @Override
    public String getId() {
        return idProveedor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Proveedor ID: " + idProveedor + ", Nombre: " + getNombre() + 
                           ", Direccion: " + getDireccion() + ", Telefono: " + getTelefono());
    }
}
