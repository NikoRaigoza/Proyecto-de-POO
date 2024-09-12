import java.util.Date;

public class Factura {
    private int idFactura;
    private Venta venta;
    private Date fechaEmision;

    public Factura(Venta venta) {
        this.venta = venta;
        this.fechaEmision = new Date();
    }

   // generar PDF
    public void generarPDF() {
        System.out.println("Generando PDF de la factura...");

    }

    // Getters
    public int getIdFactura() {
        return idFactura;
    }

    public Venta getVenta() {
        return venta;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }
}

