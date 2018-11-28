/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practica;

import java.util.ArrayList;

/**
 *
 * @author gferrer_mecon
 */
public class Ejer_Practica
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Animal a1=new Perro("cuchuflo",10, true);
        Animal a2=new Gato("mishu",10,true);
        Persona p1=new Niño("Pedro");
        iComportamiento x1=new Perro("laky", 5, true);
        iComportamiento x2=new Gato("minino",10,true);
        iComportamiento x3=new Niño("juan");
                
        ArrayList<iComportamiento> lista = new ArrayList<>();
        
        lista.add(a1);
        lista.add(a2);
        lista.add(p1);
        lista.add(x1);
        lista.add(x2);
        lista.add(x3);
        
        for (iComportamiento record : lista)
        {
            System.out.println("-------");
            System.out.println(record.toString());
        }
        
    }
    
}
