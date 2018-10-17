/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase5;


import java.util.Date;

/**
 *
 * @author gferrer_mecon
 */
public class Ejercicio_clase5
{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        MiClase objeto1 = new MiClase(10,"pepe",new Date(2018,10,05));
        MiClase objeto2 = new MiClase(0,"juan", new Date());
        MiClase objeto3 = new MiClase(0,"juan");
        MiClase objeto4 = new MiClase(objeto1);
        objeto1.mostrarDatos();
        objeto3.mostrarDatos();
        objeto4.mostrarDatos();      

    }
    
}
