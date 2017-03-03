
package prendas;

import javax.swing.JOptionPane;


public class Tipo {
    //String faldas,vestidos,pantalones,jerseys,chaquetas,abrigos,zapatos,camisetas,blusas,accesorios;
    String tipo;  
    String talla;
    int cantidad;
    int precio;
    int referencia;
    
            
    public void pedirTipo(){      
        tipo = JOptionPane.showInputDialog("Elige entre nuestros productos: ");
}
    public void pedirTalla(){
        talla=JOptionPane.showInputDialog("Elige la talla: ");
    }
    public void pedirCantidad(){
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Escoja la cantidad: "));
    }
    public void pedirPrecio(){
        precio=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
        
    }
    public void referencia(){
        referencia=Integer.parseInt(JOptionPane.showInputDialog("REFERENCIA"));
    }
}

