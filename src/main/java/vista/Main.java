package vista;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Factura;
import modelo.Pago;
import modelo.Producto;

/**
 *
 * @author david
 */
public class Main {
    public static void main(String[] args) {
        
        
        Producto p1=new Producto(100, "Blanco", "Nike", 32, "Zapato Correr", 85, "Tela Transpirable", true);
        p1.imprimir();
        
        System.out.println("--------------------------------------------------------------------------------");
        
        
        Cliente  cliente1 = new Cliente(001, 1004735617, "David", "Puetate", 963294841, "Ibarra", "dc19@gmai.com", true);
        cliente1.imprimir();
       
        System.out.println("--------------------------------------------------------------------------------");

        Empleado emple1=new Empleado(001, 1004735615, "Pepe", "Alvarez", 963295475, "pepe@gmail.com", "Caranqui");
        emple1.imprimir();
        
        System.out.println("--------------------------------------------------------------------------------");
        
        
        Factura factura1=new Factura(1000, "1 Camiza de mujer", "10/08/204", 55, emple1, cliente1);
        factura1.imprimir();
        System.out.println("--------------------------------------------------------------------------------");

        Pago pago1=new Pago(500, 55, "Pantalon mujer", "Efectivo", "26/05/2024");
        pago1.imprimir();
            
//        detalle detalle =new Detalle();
//        String[] detalle[2] =["Camiseta","Zapato deportivo",]
    }
}
