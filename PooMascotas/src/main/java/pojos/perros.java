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
public class perros {
    
    //propriedades de perro
    
    String nombrePerro;
    String tipoAlimento;
    int edadPerro;

    public perros(String nombrePerro, String tipoAlimento, int edadPerro) {
        this.nombrePerro = nombrePerro;
        this.tipoAlimento = tipoAlimento;
        this.edadPerro = edadPerro;
    }
    
    
    
  

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }
    
    
    
      public void imprimirPerros(){
    
        JOptionPane.showMessageDialog(null, "Datos perro:\n\n"
                                            + "\n\nNombre perro: " +  getNombrePerro()
                                            + "\n\nAlimento: " + getTipoAlimento()
                                            + "\n\nedad: " + getEdadPerro());
    
    
    }
    
    
    
    
    
    
}
