package modelo;

/**
 *
 * @author david
 */
public class Cliente {
    private int pcdfIdCliente;
    private int pcdfCedula;
    private String pcdfNombre;
    private String pcdfApellido;
    private int pcdfTelefono;
    private String pcdfDireccion;
    private boolean pcdfCreditoDirecto;
 
    public Cliente(){}
    public Cliente(int pcdfIdCliente, int pcdfCedula, String pcdfNombre, String pcdfApellido,int pcdfTelefono, String pcdfDireccion,boolean pcdfCreditoDirecto){
        this.pcdfIdCliente=pcdfIdCliente;
        this.pcdfCedula=pcdfCedula;
        this.pcdfNombre=pcdfNombre;
        this.pcdfApellido=pcdfApellido;
        this.pcdfTelefono=pcdfTelefono;
        this.pcdfDireccion=pcdfDireccion;
        this.pcdfCreditoDirecto=pcdfCreditoDirecto;
    }

    public int getPcdfIdCliente() {
        return pcdfIdCliente;
    }

    public void setPcdfIdCliente(int pcdfIdCliente) {
        this.pcdfIdCliente = pcdfIdCliente;
    }

    public int getPcdfCedula() {
        return pcdfCedula;
    }

    public void setPcdfCedula(int pcdfCedula) {
        this.pcdfCedula = pcdfCedula;
    }

    public String getPcdfNombre() {
        return pcdfNombre;
    }

    public void setPcdfNombre(String pcdfNombre) {
        this.pcdfNombre = pcdfNombre;
    }

    public String getPcdfApellido() {
        return pcdfApellido;
    }

    public void setPcdfApellido(String pcdfApellido) {
        this.pcdfApellido = pcdfApellido;
    }

    public int getPcdfTelefono() {
        return pcdfTelefono;
    }

    public void setPcdfTelefono(int pcdfTelefono) {
        this.pcdfTelefono = pcdfTelefono;
    }

    public String getPcdfDireccion() {
        return pcdfDireccion;
    }

    public void setPcdfDireccion(String pcdfDireccion) {
        this.pcdfDireccion = pcdfDireccion;
    }

    public boolean getPcdfCreditoDirecto() {
        return pcdfCreditoDirecto;
    }

    public void setPcdfCreditoDirecto(boolean pcdfCreditoDirecto) {
        this.pcdfCreditoDirecto = pcdfCreditoDirecto;
    }
    
    public void imprimir(){
        System.out.println("Los datos son:"
                + "\n El nombre es: "+getPcdfNombre()+" "+getPcdfApellido()
                +"\n ");
        
    
    }
    
}
    