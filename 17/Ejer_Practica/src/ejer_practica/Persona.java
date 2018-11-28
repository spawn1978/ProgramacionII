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
public class Persona implements iComportamiento
{
    protected String _nombre;
    
    //<editor-fold desc="CONSTRUCTOR">
        public Persona(String nombre)
        {
            this._nombre=nombre;
        }
    //</editor-fold>
        
    //<editor-fold desc="METODOS">
        @Override public String toString()
        {        
            StringBuilder cadena =new StringBuilder();            
            cadena.append("Nombre: ").append(this._nombre);
            return cadena.toString();
        }
    //</editor-fold>

    //<editor-fold desc="METODOS-INTERFASE">
        @Override public void alimentarse(eComida comida)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override public void dormir(int tiempoDeSueño)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    //</editor-fold>
}
