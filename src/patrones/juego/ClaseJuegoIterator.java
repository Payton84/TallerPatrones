/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.juego;

import java.util.Iterator;

/**
 *
 * @author estudiantes
 */
public class ClaseJuegoIterator implements Iterator <Juego>{

    private Juego[] juego;
    private int posicion=0;
    
    ClaseJuegoIterator(Juego[] jue) {
      juego=jue;
    }
    public Juego next(){
        return juego[posicion++];
    }
    
    public boolean hasNext() {
         if(posicion<juego.length&&juego[posicion]!=null){
            return true;
        }else{
            return false;
        }
    }
}
