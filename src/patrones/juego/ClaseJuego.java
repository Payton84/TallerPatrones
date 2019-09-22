/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.juego;

/**
 * ITERATOR
 * @author estudiantes
 */
public class ClaseJuego {
    
    private Juego[] juegos = new Juego[3];
    private int num = 0;
    private String categoriaJuego;

    public ClaseJuego(String c) {
      categoriaJuego=c;
    }
    public String getName(){
        return categoriaJuego;
    }
    
    public void add(String juego){
        Juego jue=new Juego(juego, categoriaJuego);
        juegos[num++]=jue;
    }
    public ClaseJuegoIterator iterator(){
        return new ClaseJuegoIterator(juegos);
    }
}
