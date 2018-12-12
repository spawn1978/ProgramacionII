/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_excepciones;

import java.util.Random;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author gferrer_mecon
 */
public class Ejer1_excepciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            int Max=RandomInt(8,110);
            int Min=RandomInt(8,110);
            System.out.println("Nros: Maximo:" +  Max + " Minimo: " + Min);
            
            try
            {            
                Ejer1_excepciones.verificarRango( Max , Min );
            }
            catch(fueraDeRangoExcepcion e)
            {
                System.out.println(e.getMessage());
            }            
        }// FIN FOR
        
    }
    
    
    public static void verificarRango(int nro1, int nro2) throws fueraDeRangoExcepcion
    {
        int Max=100; int Min=9;
        
        if( !(nro1 < Max && nro2 > Min) )
        {
            throw new fueraDeRangoExcepcion(" ERROR. El parámetro 1 debe ser menor a " + Max + " y el parámetro 2 mayor a " + Min);
        }
        else
        {
            System.out.println(nro1 + " / " + nro2 + " = " + ((float)nro1 / nro2));
        }
    }
    
    private static int RandomInt(int Min, int Max)
    {
        Random semilla = new Random();
        int Nro = semilla.nextInt(Max + 1 - Min);
        return Nro;
    }
    

}
