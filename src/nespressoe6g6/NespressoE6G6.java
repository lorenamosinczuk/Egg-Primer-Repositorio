/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespressoe6g6;

import nespressoEntidades.Cafetera;
import nespressoServicio.CafeteraServicio;

/**
 *
 * @author Mariano
 */
public class NespressoE6G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    CafeteraServicio cafetera = new CafeteraServicio();
    Cafetera ca1 = cafetera.crearCafetera();
    
    cafetera.llenarCafetera(ca1);
    cafetera.servirTaza(ca1);
    cafetera.vaciarCafetera(ca1);
    cafetera.agregarCafe(ca1);
  
    }  
}
