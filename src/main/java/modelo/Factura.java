package modelo;
/**
 *
 * @author david
 */
public class Factura {
    private int pcdfNumFactura;
    private String pcdfDetalle;
    private String pcdfFecha;
    private double pcdfTotal;
    private Empleado pcdfEmpleado;
    private Cliente pcdfCliente;

    public Factura() {
    }

    public Factura(int pcdfNumFactura, String pcdfDetalle, String pcdfFecha, double pcdfTotal, Empleado pcdfEmpleado, Cliente pcdfCliente) {
        this.pcdfNumFactura = pcdfNumFactura;
        this.pcdfDetalle = pcdfDetalle;
        this.pcdfFecha = pcdfFecha;
        this.pcdfTotal = pcdfTotal;
        this.pcdfEmpleado = pcdfEmpleado;
        this.pcdfCliente = pcdfCliente;
    }

    public int getPcdfNumFactura() {
        return pcdfNumFactura;
    }

    public void setPcdfNumFactura(int pcdfNumFactura) {
        this.pcdfNumFactura = pcdfNumFactura;
    }

    public String getPcdfDetalle() {
        return pcdfDetalle;
    }

    public void setPcdfDetalle(String pcdfDetalle) {
        this.pcdfDetalle = pcdfDetalle;
    }

    public String getPcdfFecha() {
        return pcdfFecha;
    }

    public void setPcdfFecha(String pcdfFecha) {
        this.pcdfFecha = pcdfFecha;
    }

    public double getPcdfTotal() {
        return pcdfTotal;
    }

    public void setPcdfTotal(double pcdfTotal) {
        this.pcdfTotal = pcdfTotal;
    }

    public Empleado getPcdfEmpleado() {
        return pcdfEmpleado;
    }

    public void setPcdfEmpleado(Empleado pcdfEmpleado) {
        this.pcdfEmpleado = pcdfEmpleado;
    }

    public Cliente getPcdfCliente() {
        return pcdfCliente;
    }

    public void setPcdfCliente(Cliente pcdfCliente) {
        this.pcdfCliente = pcdfCliente;
    }
    
    public void imprimir (){
        System.out.println("Los datos de la factura son: "
                + "\n Numero de la factura: "+pcdfNumFactura
                +"\n Fecha: "+pcdfFecha
                +"\n Empleado: "+pcdfEmpleado
                +"\n Cliente: "+pcdfCliente
                +"\n Detalle: "+pcdfDetalle
                +"\n Total: "+pcdfTotal);
    }
}
