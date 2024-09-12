public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;
    private Proveedor proveedor;

    public Producto(int idProducto, String nombreProducto, String descripcion, double precio, int cantidadEnStock, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.proveedor = proveedor;
    }

    // actualizar stock
    public void actualizarStock(int cantidad) {
        this.cantidadEnStock += cantidad;
    }

    public void reabastecerStock(int cantidad) {
        this.cantidadEnStock = cantidad;
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}

