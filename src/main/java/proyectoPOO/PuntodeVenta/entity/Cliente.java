package proyectoPOO.PuntodeVenta.entity;

public class Cliente extends Persona {
    private String idCliente;


    public Cliente(String idCliente, String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
        this.idCliente = idCliente;
    }

    public String getId() {
        return idCliente;
    }

    public void mostrarInfo() {
        System.out.println("Cliente ID: " + idCliente + ", Nombre: " + getNombre() + ", Direccion: " + getDireccion() + ", Telefono: " + getTelefono());
    }
}

