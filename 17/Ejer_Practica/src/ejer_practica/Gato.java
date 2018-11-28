/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practica;


public class Gato extends Animal
{
    protected boolean esAmigable;
    
    //<editor-fold desc="CONSTRUCTOR">
        public Gato(String nombre, int edad, boolean amigable)
        {
            super(nombre, edad);
            this.esAmigable=amigable;
        }
    //</editor-fold>

    //<editor-fold desc="METODOS DE INTERFASE">
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
    //</editor-fold>
    //<editor-fold desc="METODOS">
        @Override public String toString()
        {        
            StringBuilder cadena =new StringBuilder();
            cadena.append(super.toString());
            cadena.append(" Es Amigable: ").append(this.esAmigable);
            return cadena.toString();
        }
    //</editor-fold>
}
