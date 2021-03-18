package pojos;

public class salaCine { //Inicia clase
    //atributos

    int Aforo;
    int Ocupadas;

    String Pelicula;

    double Entrada;

    //constructor
    public salaCine() { //inicia constructor

        //declarando valores de variables
        Aforo = 20;

        Ocupadas = 0;

        Pelicula = "";

        Entrada = 50.0;
    }//termina constructor

    //metodos get y set
    //metodo set Aforo
    public void setAforo(int afo) { //metodo publico 

        Aforo = afo;

    }

    public void setOcupadas(int ocupado) { //metodo ocupado (butacas ocupadas) 

        Ocupadas = ocupado;

    }

    //metodo  set pelicula
    public void setPelicula(String nomPeli) {

        Pelicula = nomPeli;

    }

    //metodo para las entradas.
    public void setEntrada(double entradasCine) {

        Entrada = entradasCine;

    }

    //metodo para calcular cuantas butacas quedan disponibles (setLibres)
    public void setLibres(int butacasLibres) {

        int ocu;

        ocu = Aforo - butacasLibres;

        Ocupadas = ocu;

    }

    //metodos get 
    //metodo get aforo
    public int getAforo() {

        //los get siempre tienen datos de retorno
        return Aforo;

    }

    //metodo getOcupados
    public int getOcupadas() {

        return Ocupadas;

    }

    //metodo  getPelicula 
    public String getPelicula() {

        return Pelicula;

    }

    //metodo get entrada
    public double getEntrada() {

        return Entrada;

    }

    //metodo get libres
    public int getLibres() {

        int butacasLibres;

        butacasLibres = Aforo - Ocupadas;

        return butacasLibres;

    }

    //metodo get para calcular el porcentaje de que ocupacion llevo de la sala 
    public double getPorcentaje() {

        double porcentajeTotal;
        porcentajeTotal = (double) Ocupadas / (double) Aforo * 100.0;

        return porcentajeTotal;

    }

    //calcular metodo de ingresos 
    public double getIngresos() {

        double ingresosTotales;

        ingresosTotales = Ocupadas * Entrada;

        return ingresosTotales;

    }

    //metodo limpiar
    public void vaciarCeldas() {
        Ocupadas = 0;

        Pelicula = "";

    }

    //metodo por cada ingreso 
    public void entradaUno() {

        Ocupadas++;

    }

    //metodos por aplicación
}//Termina clase
