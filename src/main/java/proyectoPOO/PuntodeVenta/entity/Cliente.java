package proyectoPOO.PuntodeVenta.entity;

public class Cliente extends Persona implements Identificable {
    private String idCliente;

    public Cliente(String idCliente, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.idCliente = idCliente;
    }

    @Override
    public String getId() {
        return idCliente;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente ID: " + idCliente + ", Nombre: " + getNombre() + 
                           ", Direccion: " + getDireccion() + ", Telefono: " + getTelefono());
    }
}
