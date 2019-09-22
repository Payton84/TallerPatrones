/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.juego;

/**
 * ADAPTER
 * @author estudiantes
 */
public class JuegoPirata {
    
    private Juego juego;

    public JuegoPirata(Juego juego) {
        this.juego = juego;
    }
    
    public String getProductora(){
        return "Kanomi";
    }
    
    public String getNombre (){
        return "Crash";
    }
    
    public int getAñoLanzamiento(){
        return juego.getAñoLanzamiento();
    }
}
