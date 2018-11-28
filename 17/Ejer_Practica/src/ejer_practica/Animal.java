/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practica;

/**
 *
 * @author gferrer_mecon
 */
abstract public  class Animal implements iJugable, iComportamiento
{
    protected String _nombre;
    protected int _edad;
    
    public Animal(String nombre,int edad)
    {
        this._nombre=nombre;
        this._edad=edad;
    }
    
    
    @Override public String toString()
    {
        StringBuilder cadena =new StringBuilder();
        cadena.append(" Nombre: ").append(this._nombre);
        cadena.append(" Edad: ").append(this._edad);
        return cadena.toString();
    }
    
}
