/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gferrer_mecon
 */
public class Clase7_ArrayList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        ArrayList <Integer> lista;
        lista = new ArrayList<>();
        lista.add(7);
        lista.add(1);
        lista.add(3);
        
        Collections.sort(lista);
        
        for (Integer integer : lista)
        {
            System.out.println("Elemento: " + integer );
        }
        
    }
   
    
}
