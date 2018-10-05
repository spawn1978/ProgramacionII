/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clases;

/**
 *
 * velocidadActual = velocidad del automovil
 * @author gferrer_mecon
 */
public class Automovil {
    public static int cantidadRuedas; //esta siempre en la clase... 
    public int velocidadActual; //solo cuando se instancia
    
    
    public static void MostrarCantRuedas()
    {
        System.out.println("Cantidad de ruedas: " + cantidadRuedas);
    }

    public void Acelerar( int aceleracion)
    {
        this.velocidadActual += aceleracion;
        System.out.println(cantidadRuedas);
    }
    
}

