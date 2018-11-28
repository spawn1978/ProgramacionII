/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practica;


public class Niño extends Persona
{
    
    public Niño(String nombre)
    {
        super(nombre);
    }
    
        @Override public String toString()
        {        
            StringBuilder cadena =new StringBuilder();            
            cadena.append(super.toString());
            return cadena.toString();
        }
}
