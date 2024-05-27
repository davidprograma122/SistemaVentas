package modelo;
/**
 *
 * @author david
 */
public class Empleado {
    private int pcdfIdEmpleado;
    private int pcdfCedula;
    public  String pcdfNombre;
    public String pcdfApellido;
    private int pcdfTelefono;
    private String pcdfCorreo;
    private String pcdfDireccion;

    public Empleado() {
    }

    public Empleado(int pcdfIdEmpleado, int pcdfCedula, String pcdfNombre, String pcdfApellido, int pcdfTelefono, String pcdfCorreo, String pcdfDireccion) {
        this.pcdfIdEmpleado = pcdfIdEmpleado;
        this.pcdfCedula = pcdfCedula;
        this.pcdfNombre = pcdfNombre;
        this.pcdfApellido = pcdfApellido;
        this.pcdfTelefono = pcdfTelefono;
        this.pcdfCorreo = pcdfCorreo;
        this.pcdfDireccion = pcdfDireccion;
    }

    public int getPcdfIdEmpleado() {
        return pcdfIdEmpleado;
    }

    public void setPcdfIdEmpleado(int pcdfIdEmpleado) {
        this.pcdfIdEmpleado = pcdfIdEmpleado;
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

    public String getPcdfCorreo() {
        return pcdfCorreo;
    }

    public void setPcdfCorreo(String pcdfCorreo) {
        this.pcdfCorreo = pcdfCorreo;
    }

    public String getPcdfDireccion() {
        return pcdfDireccion;
    }

    public void setPcdfDireccion(String pcdfDireccion) {
        this.pcdfDireccion = pcdfDireccion;
    }
    
    public void imprimir(){
        System.out.println("Los datos del empleado son: "
                +"\n El nombre es: "+getPcdfNombre()+" "+getPcdfApellido()
                +"\nCon numero de cedula: "+getPcdfCedula()
                +"\nDirección: "+getPcdfDireccion()
                +"\nTelefono: "+getPcdfTelefono()
                +"\n Correo: "+getPcdfCorreo());
    }
    
}
