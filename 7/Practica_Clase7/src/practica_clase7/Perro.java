/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_clase7;

/**
 *
 * @author gferrer_mecon
 */
public class Perro
{
    private String _nombre;
    private int _edad;
    private eRaza _raza;

    //<editor-fold desc="CONSTRUCTOR">
    
        public Perro()
        {
        }

        public Perro(String nombre, int edad, eRaza raza)
        {
            this._nombre = nombre;
            this._edad = edad;
            this._raza = raza;
        }
    //</editor-fold>
    
    //<editor-fold desc="GETTERS - SETERS">
        
        public String getNombre()
        {
            return _nombre;
        }

        public void setNombre(String nombre)
        {
            this._nombre = nombre;
        }

        public int getEdad()
        {
            return _edad;
        }

        public void setEdad(int edad)
        {
            this._edad = edad;
        }

        public eRaza getRaza()
        {
            return _raza;
        }

        public void setRaza(eRaza raza)
        {
            this._raza = raza;
        }
    //</editor-fold>
        
    //<editor-fold desc="METODOS">

        static void mostrarPerro(Perro objeto)
        {
            //System.out.println("Nombre: " + objeto._nombre + " Edad: " + objeto._edad + " Raza: " + objeto._raza);
            StringBuilder cadena=new StringBuilder();
            cadena.append("Nombre: ");
            cadena.append(objeto._nombre);
            cadena.append(" Edad: ");
            cadena.append(objeto._edad);
            cadena.append(" Raza: ");
            cadena.append(objeto._raza);
            System.out.println(cadena);
        }
        //</editor-fold>
    
}
