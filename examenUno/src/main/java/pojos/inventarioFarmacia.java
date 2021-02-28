/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author zof
 */
public class inventarioFarmacia {
    
    
     //atributos

    int disponibles;
    int vendidas;

    String medicamento;

    double costo;

    //constructor
    public inventarioFarmacia() { //inicia constructor

        //declarando valores de variables
        disponibles = 20;

        vendidas = 0;

        medicamento = "";

        costo = 50.0;
    }//termina constructor

    //metodos get y set
    //metodo set Aforo
    public void setDisponibles(int dispo) { //metodo publico 

        disponibles = dispo;

    }

    public void setVendidas(int vendido) { //metodo ocupado (butacas ocupadas) 

        vendidas = vendido;

    }

    //metodo  set pelicula
    public void setMedicamento(String nomMedicina) {

        medicamento = nomMedicina;

    }

    //metodo para las entradas.
    public void setCosto(double costoMedicina) {

        costo = costoMedicina;

    }

    //metodo para calcular cuantas butacas quedan disponibles (setLibres)
    public void setLibres(int mediLibre) {

        int vendi;

        vendi = disponibles - mediLibre;

        vendidas = vendi;

    }

    //metodos get 
    //metodo get aforo
    public int getDisponibles() {

        //los get siempre tienen datos de retorno
        return disponibles;

    }

    //metodo getOcupados
    public int getVendidas() {

        return vendidas;

    }

    //metodo  getPelicula 
    public String getMedicina() {

        return medicamento;

    }

    //metodo get entrada
    public double getCosto() {

        return costo;

    }

    //metodo get libres
    public int getLibres() {

        int medicinaDispo;

        medicinaDispo = disponibles - vendidas;

        return medicinaDispo;

    }

    //metodo get para calcular el porcentaje de que ocupacion llevo de la sala 
    public double getPorcentaje() {

        double porcentajeTotal;
        porcentajeTotal = (double) vendidas / (double) disponibles * 100.0;

        return porcentajeTotal;

    }

    //calcular metodo de ingresos 
    public double getIngresos() {

        double ingresosTotales;

        ingresosTotales = vendidas * costo;

        return ingresosTotales;

    }

    //metodo limpiar
    public void vaciarCeldas() {
        vendidas = 0;

        medicamento = "";

    }

    //metodo por cada ingreso 
    public void medUno() {

        vendidas++;

    }
    
    
}
