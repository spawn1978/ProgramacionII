/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase6;

import java.util.Scanner;

/**
 *
 * @author gferrer_mecon
 */
public class Genericas
{
        public static int getNro(String sms)
        {        
            int Nro;
            Scanner lector = new Scanner(System.in);        
            System.out.print(sms); //saco datos por la consola
            Nro=lector.nextInt();        
            return Nro;
        }
        
        public static int [] cargarVectorInt(int cant)
        {
            int [] vector=new int[cant];
            for (int i = 0; i < vector.length; i++)
            {
                 vector[i]=Genericas.getNro("Ingrese Nota: ");
                
            }
            return vector;
        }   

}
