package modelo;
/**
 *
 * @author david
 */
public class Producto {
    private int pcdfIdProducto;
    private String pcdfColor;
    private int pcdfTalla;
    private String pcdfModelo;
    private double pcdfPrecio;
    private String pcdfTipoTela;
    private boolean pcdfStock;

    public Producto() {
    }

    public Producto(int pcdfIdProducto, String pcdfColor, int pcdfTalla, String pcdfModelo, double pcdfPrecio, String pcdfTipoTela, boolean pcdfStock) {
        this.pcdfIdProducto = pcdfIdProducto;
        this.pcdfColor = pcdfColor;
        this.pcdfTalla = pcdfTalla;
        this.pcdfModelo = pcdfModelo;
        this.pcdfPrecio = pcdfPrecio;
        this.pcdfTipoTela = pcdfTipoTela;
        this.pcdfStock = pcdfStock;
    }
    

    public int getPcdfIdProducto() {
        return pcdfIdProducto;
    }

    public void setPcdfIdProducto(int pcdfIdProducto) {
        this.pcdfIdProducto = pcdfIdProducto;
    }

    public String getPcdfColor() {
        return pcdfColor;
    }

    public void setPcdfColor(String pcdfColor) {
        this.pcdfColor = pcdfColor;
    }

    public int getPcdfTalla() {
        return pcdfTalla;
    }

    public void setPcdfTalla(int pcdfTalla) {
        this.pcdfTalla = pcdfTalla;
    }

    public String getPcdfModelo() {
        return pcdfModelo;
    }

    public void setPcdfModelo(String pcdfModelo) {
        this.pcdfModelo = pcdfModelo;
    }

    public double getPcdfPrecio() {
        return pcdfPrecio;
    }

    public void setPcdfPrecio(double pcdfPrecio) {
        this.pcdfPrecio = pcdfPrecio;
    }

    public String getPcdfTipoTela() {
        return pcdfTipoTela;
    }

    public void setPcdfTipoTela(String pcdfTipoTela) {
        this.pcdfTipoTela = pcdfTipoTela;
    }

    public boolean getPcdfStock() {
        return pcdfStock;
    }

    public void setPcdfStock(boolean pcdfStock) {
        this.pcdfStock = pcdfStock;
    }
    
    public void imprimir() {
    System.out.println("Los datos de producto son: "
            +"\n Color: "+pcdfColor
            +"\n Talla: "+pcdfTalla
            +"\n Modelo: "+pcdfModelo
            +"\n Precio: "+pcdfPrecio
            +"\n Tipo de tela: "+pcdfTipoTela);

}
    
    
}
