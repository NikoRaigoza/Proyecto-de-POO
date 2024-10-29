package proyectoPOO.PuntodeVenta.entity;

public class Main {
    public static void main(String[] args) {
        // Crear algunos clientes
        Cliente cliente1 = new Cliente("C001", "Juan Pérez", "Calle 123", "555-1234", "juan@example.com");
        Cliente cliente2 = new Cliente("C002", "Ana Gómez", "Avenida 456", "555-5678", "ana@example.com");

        // Crear algunos productos
        Producto producto1 = new Producto("P001", "Café", 5.0, 50);
        Producto producto2 = new Producto("P002", "Leche", 2.5, 30);
        Producto producto3 = new Producto("P003", "Pan", 1.5, 20);

        // Crear el inventario y agregar productos
        Inventario inventario = new Inventario();
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Mostrar inventario
        System.out.println("Inventario inicial:");
        inventario.mostrarInventario();

        // Crear un pedido para el cliente1
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(producto1, 2);  // Agregar 2 unidades de Café
        pedido1.agregarProducto(producto2, 1);  // Agregar 1 unidad de Leche

        // Mostrar detalles del pedido
        System.out.println("\nDetalles del pedido:");
        pedido1.mostrarDetalles();

        // Mostrar inventario después del pedido
        System.out.println("\nInventario después del pedido:");
        inventario.mostrarInventario();

        // Crear otro pedido para el cliente2
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(producto2, 2);  // Agregar 2 unidades de Leche
        pedido2.agregarProducto(producto3, 5);  // Agregar 5 unidades de Pan

        // Mostrar detalles del segundo pedido
        System.out.println("\nDetalles del segundo pedido:");
        pedido2.mostrarDetalles();

        // Mostrar inventario final
        System.out.println("\nInventario final:");
        inventario.mostrarInventario();
    }
}
