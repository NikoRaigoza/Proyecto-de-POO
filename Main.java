package proyectoPOO.PuntodeVenta;

import proyectoPOO.PuntodeVenta.entity.Cliente;
import proyectoPOO.PuntodeVenta.entity.Proveedor;
import proyectoPOO.PuntodeVenta.entity.Identificable;

public class Main {
    public static void main(String[] args) {
        Identificable cliente = new Cliente("C001", "Juan Pérez", "Calle 123", "123456789", "juan@mail.com");
        Identificable proveedor = new Proveedor("P001", "ACME Corp", "Avenida 456", "987654321", "acme@mail.com");

        cliente.mostrarInfo();
        proveedor.mostrarInfo();
    }
}
