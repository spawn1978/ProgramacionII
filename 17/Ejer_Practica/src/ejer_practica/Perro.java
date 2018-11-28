/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practica;


public class Perro extends Animal
{
    protected boolean _tieneVacunas;
    
    public Perro(String nombre, int edad, boolean vacunado)
    {
        super(nombre, edad);
        this._tieneVacunas=vacunado;
    }
    
    @Override    public void jugar(String juego)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override    public void alimentarse(eComida comida)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override    public void dormir(int tiempoDeSueño)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override public String toString()
    {        
        StringBuilder cadena =new StringBuilder();
        cadena.append(super.toString());
        cadena.append(" Tiene Vacunas: ").append(this._tieneVacunas);        
        return cadena.toString();
    }
    
}
