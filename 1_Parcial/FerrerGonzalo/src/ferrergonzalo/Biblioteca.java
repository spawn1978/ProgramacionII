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
            for (Libro unLibro : this._libros)
            {
        
                if ( ( ELibro.MANUAL ==  Libro.getTipoLibro(libroBuscar) )  &&   (Libro.getTipoLibro(unLibro)== ELibro.MANUAL) )
                {
                    if(Manual.compararManuales( (Manual) unLibro, (Manual) libroBuscar) )
                    {
                        retorno = true;
                        break;
                    }
                }

                 if ( ( ELibro.NOVELA ==  Libro.getTipoLibro(libroBuscar) )  &&   (Libro.getTipoLibro(unLibro)== ELibro.NOVELA) )
                {
                    if(Novela.compararNovelas((Novela) unLibro, (Novela) libroBuscar))
                    {
                        retorno = true;
                        break;
                    }
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
        
        private float obtenerPrecio(ELibro TipoLibro)
        {
            float retorno=0;
            for (Libro unLibro : this._libros)
            {
                if(Libro.getTipoLibro(unLibro)== TipoLibro)
                {
                   retorno+=  unLibro.getPrecio();
                }
            }
            return retorno;
        }        
        
        public float getPrecioDeManuales()
        {
            return obtenerPrecio(ELibro.MANUAL);
        }
        
        public float getPrecioDeNovelas()
        {                      
            return obtenerPrecio(ELibro.NOVELA);
        }
        
        public float getPrecioTotal()
        {
            float PrecioTotal = obtenerPrecio(ELibro.NOVELA) + obtenerPrecio(ELibro.MANUAL);
            return PrecioTotal;
        }
       
        public static String mostrarBiblioteca (Biblioteca unaBiblioteca)
        {
            StringBuilder cadena = new StringBuilder();
            
                cadena.append(" Capacidad Biblioteca: ").append(unaBiblioteca._capacidad);
                cadena.append("\n--------------------------\n");
                for (Libro unLibro : unaBiblioteca._libros)
                {
                    
                    
                    if ( Libro.getTipoLibro(unLibro)== ELibro.MANUAL) 
                     {
                         Manual temp=(Manual) unLibro;
                         cadena.append( temp.mostrar() ) ;
                        //cadena.append( (Manual) unLibro.mostrar() ) ;
                     }
                    
                     if ( Libro.getTipoLibro(unLibro)== ELibro.NOVELA) 
                     {
                         Novela temp= (Novela) unLibro;
                         cadena.append ( temp.mostrar() );
                         //cadena.append ( (Novela) unLibro.mostrar() );
                     }
                     cadena.append("\n");
                }
                cadena.append("\n--------------------------\n");
                cadena.append("\n Precios Todas las Novelas: ").append(unaBiblioteca.getPrecioDeNovelas());
                cadena.append("\n Precios Todos los Manuales: ").append(unaBiblioteca.getPrecioDeManuales());
                cadena.append("\n Precios Todos: ").append(unaBiblioteca.getPrecioTotal());
                          
            return cadena.toString();
        }
    //</editor-fold>
}
