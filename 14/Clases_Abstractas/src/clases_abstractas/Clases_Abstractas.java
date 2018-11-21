/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;

import java.util.ArrayList;

/**
 *
 * @author gferrer_mecon
 */
public class Clases_Abstractas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<ClaseUno> lista = new ArrayList<>();
        
        ClaseDos dos=new ClaseDos("pepe", 10);
        ClaseTres tres=new ClaseTres(dos, 20);      
       
        lista.add(dos);
        lista.add(tres);
        lista.add( new ClaseTres("juan",30,(float) 10.2));

        for (ClaseUno record : lista)
        {
            System.out.println("----- Metodo Abstract: Lista -----");
            //System.out.println(record.mostrar());
            System.out.println(record.toString());
        }
    }
    
}
