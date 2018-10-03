/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gferrer_mecon
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unNumero;
        Scanner lector = new Scanner(System.in); 
        
        System.out.println("Ingrese un Nro: "); //saco datos por la consola
        unNumero=lector.nextInt();//tomo datos de la consola
        System.out.println("El numero es: "+unNumero);
        
        
    }
    
}
