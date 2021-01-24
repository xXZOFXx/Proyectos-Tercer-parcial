/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

clase plantilla base para gtenerar objetos elemento principal de programacion

 */
package componentespoo;

import javax.swing.JOptionPane;

/**
 *
 * @author zof
 */
public class elementosPoo {

    //atributos las carateristicas de los objetos 
    String nombre;

    int matricula;

    String carrera;

    String materia;

    //metodo o funcion (miniPrograma) principal nombrado igual qie la clase (constructor)
    public elementosPoo(String nom, int matri, String carr) {

        nombre = nom;
        matricula = matri;

        carrera = carr;

    }

    public void elementosProf() {

        JOptionPane.showMessageDialog(null, "\nDatos Profesor: " + "\nNombre: " + nombre + "\n Matricula: " + matricula + " \nMateria: " + carrera);

    }

    //metodfos o funciones espeficicas = declaradas y generadas por programación
    //metodo imprimir datos alumnos
    public void imprimirDatosAlumno() { //metodo vacio (solo esta procesando )

        JOptionPane.showMessageDialog(null, "\nDatos alumno: " + "\nNombre: " + nombre + "\n Matricula: " + matricula + " \nCarrera: " + carrera);

    } //termina metodo para imprimir

//metodo o funcion principal que permite ejecutar o compilar un programa  "main"
    public static void main(String[] args) {

        //generacion de objetos
        elementosPoo alumno1 = new elementosPoo("Ricardo Zuniga", 150787, "informatica");  //se generan objetos 
        elementosPoo alumno2 = new elementosPoo("Elliot Anderson", 82652, "CiberSeguridad");

        alumno1.imprimirDatosAlumno(); //llamada de metodo imprimir, para poder mostrar los datos
        alumno2.imprimirDatosAlumno();

        elementosPoo profUno = new elementosPoo("Ernesto Hernandez", 4152369, "Matematicas");
        elementosPoo profDos = new elementosPoo("Veronica pedroza", 498356, "Filosofia");

        profUno.elementosProf();
        profDos.elementosProf();

    }//termina main

}// termina cuerpo de la clase 

