/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
import java.awt.Color;

/**
 *
 * @author gferrer_mecon
 */
public class Practica4
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Color colorAzul = new Color(0, 0, 255); //RGB
        Color colorRojo = new Color(255, 0, 0); //RGB
        //Color.RED
        Boligrafo biromeAzul = new Boligrafo(colorAzul, 100);
        Boligrafo biromeRoja = new Boligrafo(colorRojo, 50);
        Boligrafo biromeAux=biromeAzul;
        boolean salir=false;
        int opcion=1;
        do
        {            
            System.out.println("Elija Color");
            System.out.println("1. Azul");
            System.out.println("2. Roja");
            System.out.println("0. Salir");
            //entrar opcion
            
            switch(opcion)
            {
                case 1: 
                    biromeAux=biromeAzul;
                    break;
                case 2:
                    biromeAux=biromeRoja;
                    break;
                case 0:
                    salir=true;
                    break;
            }
            
            //System.out.println(biromeAux);
            System.out.println("-----------");
            System.out.println("Cantidad de Tinta: " + biromeAux.getTinta());
            System.out.println("Utilizo 30 para pintar");
            if(!biromeAux.Pintar(30))
            {
                System.out.println("Está intentado gastar por encima de la cantidad actual de tinta (" + biromeAux.getTinta() + ")");
            }
            
        } while(salir);
        
        
    }
    
}
