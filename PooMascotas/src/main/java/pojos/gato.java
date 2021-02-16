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
 
 clase hija de mascotas 
 */
public class gato  extends animal{
    
    //atributos de clase gato
    
    String alimento;
    double tamanoGato;
    
    //constructor clase gato 

    public gato(String raza, int edad, String almiento, double tamanoGato) {
        super(raza, edad);
        
      this.alimento = alimento;
      this.tamanoGato = tamanoGato;
        
    }
    
    //metodo para imprimir información de gatos 
    
    //metodos de acceso para la clase gato

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String Alimento) {
        this.alimento = alimento;
    }

    public double getTamanoGato() {
        return tamanoGato;
    }

    public void setTamanoGato(double tamanoGato) {
        this.tamanoGato = tamanoGato;
    }
    
    
    
    
    public void imprimirDatosGatos(){
    
        JOptionPane.showMessageDialog(null, "Info de gato \n\n" 
                                            +"\n\n Tienda +Kotas"
                                            + "\n\n Raza: " + getRaza()
                                            + "\n\n Edad de la mascota: " + getEdad()
                                            + "\n\n Alimento del gato:" + getAlimento()
                                            + "\n\n Tamaño del gato: " + getTamanoGato());
    
    
    }
    
    
    
}//termina clase hija
