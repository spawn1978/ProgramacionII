/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clases;

/**
 *
 * @author gferrer_mecon
 */
public class Ejemplo_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miAuto;
        miAuto = new Automovil();
        miAuto.velocidadActual=10;
        Automovil.cantidadRuedas=4;

        System.out.println("Cantidad de ruedas: " + Automovil.cantidadRuedas);
        Automovil.MostrarCantRuedas();
        miAuto.Acelerar(2);
        System.out.println("miAuto.velocidadActual: " + miAuto.velocidadActual);
        
    }
    
}
