/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author gferrer_mecon
 */
public class Teoria_Clase6
{
    public static int getNro(String sms)
    {        
        int Nro;
        Scanner lector = new Scanner(System.in);        
        System.out.print(sms); //saco datos por la consola
        Nro=lector.nextInt();        
        return Nro;
    }
    
     public static void mostrarvector(int [] vector )
    {        
        //for (int i = 0; i < vector.length ; i++)
        for (int i : vector) 
        { //for eatch... recorre una coleccion de objetos
         // En el "i" recive una copia de un elemento de la coleccion 
          //por lo tanto el tipo de i debe ser del mismo tipo que el elemento de la coneccion
            //System.out.println("Nro[" + i  + "]= " + vector[i] );
            System.out.println("vector: " + i);            
        }
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int [] miVector=new int [3];
        int [] cloneVector=new int [3];
        
        for (int i = 0; i < miVector.length; i++)
        {
            miVector[i]=getNro("Ingrese nro : ");            
        }
        
        mostrarvector(miVector);
        System.out.println("Clonado");
        cloneVector=miVector.clone();
        mostrarvector(cloneVector);
        
        miVector[0]=100;
        System.out.println("Modificado");
        mostrarvector(miVector);
        System.out.println("Clonado");
        mostrarvector(cloneVector);
    }
    
}
