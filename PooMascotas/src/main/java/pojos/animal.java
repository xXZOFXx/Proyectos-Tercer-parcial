/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author zof

* app +kotas

*/
public class animal {
    
    //atributos
    
    String raza;
    int edad;
    
    
    //constructor para los animales 

    public animal(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }
    
    //metodos de acceso get y set

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
}//Termina clase
