package modelo;
/**
 *
 * @author david
 */
public class Pago {
    private int pcdfIdPago;
    private double pcdfMonto;
    private String pcdfDetalle;
    private String pcdfMetodoPago;
    private String pcdfFechaPago;

    public Pago() {
    }

    public Pago(int pcdfIdPago, double pcdfMonto, String pcdfDetalle, String pcdfMetodoPago, String pcdfFechaPago) {
        this.pcdfIdPago = pcdfIdPago;
        this.pcdfMonto = pcdfMonto;
        this.pcdfDetalle = pcdfDetalle;
        this.pcdfMetodoPago = pcdfMetodoPago;
        this.pcdfFechaPago = pcdfFechaPago;
    }

    public int getPcdfIdPago() {
        return pcdfIdPago;
    }

    public void setPcdfIdPago(int pcdfIdPago) {
        this.pcdfIdPago = pcdfIdPago;
    }

    public double getPcdfMonto() {
        return pcdfMonto;
    }

    public void setPcdfMonto(double pcdfMonto) {
        this.pcdfMonto = pcdfMonto;
    }

    public String getPcdfDetalle() {
        return pcdfDetalle;
    }

    public void setPcdfDetalle(String pcdfDetalle) {
        this.pcdfDetalle = pcdfDetalle;
    }

    public String getPcdfMetodoPago() {
        return pcdfMetodoPago;
    }

    public void setPcdfMetodoPago(String pcdfMetodoPago) {
        this.pcdfMetodoPago = pcdfMetodoPago;
    }

    public String getPcdfFechaPago() {
        return pcdfFechaPago;
    }

    public void setPcdfFechaPago(String pcdfFechaPago) {
        this.pcdfFechaPago = pcdfFechaPago;
    }
    
    public void imprimir(){
        System.out.println("Los datos del pago son: "
                + "\n El id del pago: "+ pcdfIdPago
                +"\n Cantidad: "+pcdfMonto
                +"\n Detalle del pago: "+pcdfDetalle
                +"\n Metodo de pago: "+pcdfMetodoPago
                +"\n Fecha del pago: "+pcdfFechaPago);
    
    }
    
    
}
