/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import javax.swing.JOptionPane;

/**
 *
 * @author zof
 */
public class aves {
    
    //atributos
      //atributos de clase gato
    
    String colorAve;
    String nacionalidad;
    
    //constructor clase gato 

    public aves(String colorAve, String nacionalidad) {
        this.colorAve = colorAve;
        this.nacionalidad = nacionalidad;
    }

    
    public void imprimirAves(){
    
                JOptionPane.showMessageDialog(null, "info de aves : \n\n "
                                                    + "\n\nColor Ave:" + getColorAve()
                                                    + "\n\nNacionalidad" + getNacionalidad());
    
    }
    
    
    public String getColorAve() {
        return colorAve;
    }

    public void setColorAve(String colorAve) {
        this.colorAve = colorAve;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    
    
    
  
    
    
}
