/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_excepciones;

import java.util.Stack;

/**
 *
 * @author gferrer_mecon
 */
public class Pila 
{
    public static int capacidad;
    public static Stack<Integer> numeros;
    
    static
    {
        numeros = new Stack<>();
        capacidad = 3;
    }
        
    public static void InsertarDato(int dato)throws DesbordePilaExcepcion
    {
        if( Pila.numeros.size() < Pila.capacidad)
        {
            Pila.numeros.add(dato);
        }
        else
        {
            throw new DesbordePilaExcepcion("ERROR - Pila llena..");
        }
    }
    
    public static int ExtraerDato() throws PilaVaciaExcepcion
    {
        int retorno;
        if(Pila.numeros.size()>0)
        {
            retorno = Pila.numeros.pop();
        }
        else
        {
            throw new PilaVaciaExcepcion("ERROR - Pilla vacia...");
        }
        return retorno;
    }
}
