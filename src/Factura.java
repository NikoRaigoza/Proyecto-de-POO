import java.util.Date;

public class Factura {
    private int idFactura;
    private Venta venta;
    private Date fechaEmision;

    public Factura(Venta venta) {
        this.venta = venta;
        this.fechaEmision = new Date(); // Fecha actual al momento de generar la factura
    }

    // Método para generar PDF (simulado)
    public void generarPDF() {
        System.out.println("Generando PDF de la factura...");
        // Código para generar el PDF
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

