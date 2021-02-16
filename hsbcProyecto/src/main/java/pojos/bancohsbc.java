/*
 Plantilla para generar instancias o objetos

Atributo : caracteristicas de los objetos(Variables     ) 

Constructor: metodo especial llamado igual que la clase para inicializar atributos a objetos.

Metodo:  Acciones de los objetos (miniProgramas)


objeto elemento en particular que tiene atributos y metodos 



 */
package pojos; //paquete poo es  un contenedor  de archivos  y componentes

import javax.swing.JOptionPane;



//librerias 




/**
 *
 * @author zof
 */
public class bancohsbc { 
    
//atributos clientes 
    
    int idCliente;
    String nombreCliente;
    double saldoCliente;
    
    
 //Atributos sucursales    ID sucursal, nombre sucursal y teléfono.
    
  int idSucursal;

  String nombreSucursal;

    int telSucursal;
    
    


//contructor

    

//metodos

    //metodo para clientes
    
    public bancohsbc(int idCliente, String nombreCliente, double saldoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.saldoCliente = saldoCliente;
    //termina constructor

      
    }
    
    //metodo para sucursales 

    public bancohsbc(int idSucursal, String nombreSucursal, int telSucursal) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.telSucursal = telSucursal;
    }
    
    
    
      //metodo para imprimir datos cliente
    
    
    public void imprimirDatosCliente(){
    
        JOptionPane.showMessageDialog(null, "Datos cliente hsbc: \n\n" + "\n\nID CLiente: "+ idCliente + "\n\nNombre cliente: " + nombreCliente + "\n\nSaldo cliente: " + saldoCliente );
    
    
    }
    
    
    //imprimir datos sucursales
    
     //Atributos sucursales    ID sucursal, nombre sucursal y teléfono.
    
    public void imprimirDatosSucursales(){
    
    
       JOptionPane.showMessageDialog(null, "ID Sucursal: " + idSucursal + "\n\nNombre de la sucursal: " + nombreSucursal + "\n\n  Teléfono de Sucursal: " +  telSucursal);
    
    
    }
    
    
}


