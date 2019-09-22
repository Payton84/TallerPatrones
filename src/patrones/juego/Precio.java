/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.juego;

import com.sun.org.apache.bcel.internal.classfile.Visitor;
import patrones.Tienda;

/**
 * SINGLETON
 * @author estudiantes
 */
public class Precio implements Tienda {
    
   private static Precio precio;
   private String descuento;

    public Precio() {
    }

    public static Precio getPrecio() {
        
        if (precio == null){
            precio = new Precio();
        }
        return precio;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public void compras() {
        System.out.println("precio " + this.precio);
    }
    
    
   
}
