/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrergonzalo;

import java.util.ArrayList;

/**
 *
 * @author gferrer_mecon
 */
public class Biblioteca
{
    private int _capacidad;
    private ArrayList <Libro> _libros;

    //<editor-fold desc="CONSTRUCTOR">
        public Biblioteca()
        {                
            this._libros = new ArrayList<>();       
        }

        public Biblioteca( int CapacidadMaxima)
        {                
            this();
            this._capacidad=CapacidadMaxima;
        } 
    //</editor-fold>
        
    //<editor-fold desc="METODO">
        private boolean estaEnBiblioteca(Libro libroBuscar)
        {
            boolean retorno=false;
            for (Libro unLibro : _libros)
            {
                if(Libro.compararLibros(unLibro, libroBuscar))
                {
                    retorno=true;
                    break;
                }
            }
            return retorno;
        }
        public boolean agregarLibro (Libro libroAdd)
        {
            boolean retorno=false;
            if(this._capacidad > this._libros.size() && !estaEnBiblioteca(libroAdd) )
            {
                this._libros.add(libroAdd);
                retorno=true;
            }
            return retorno;
        }
        
    //</editor-fold>
}
