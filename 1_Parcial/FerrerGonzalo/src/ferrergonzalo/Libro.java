/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrergonzalo;

import java.util.Random;

/**
 *
 * @author gferrer_mecon
 */
public class Libro
{
    protected Autor _autor;
    protected int _cantPaginas;
    protected float _precio;    
    protected String _titulo;
    
    //<editor-fold desc="CONSTRUCTOR">   
   
        public Libro()
        {
            this._cantPaginas = Libro.generadorDePaginas();
        }

        public Libro(Autor autor, String titulo)
        {
            this();
            this._autor = _autor;            
            this._titulo = _titulo;            
        }

        public Libro(Autor autor, float precio, String titulo)
        {
            this(autor,titulo);
            this._precio = _precio;            
        }
    //</editor-fold>
    
    //<editor-fold desc="METODOS">
        public int getCantidadPaginas()
        {            
            return this._cantPaginas;
        }
        public float getPrecio()
        {
            return this._precio;
        }
        
        private static int generadorDePaginas()
        {
            int MIN=10; int MAX=580;
            Random semilla=new Random();        
            int Nro = MIN + semilla.nextInt() * (MAX - MIN);
            return Nro;
        }
        public static boolean compararLibros ( Libro unLibro, Libro otroLibro)
        {
            boolean igualTitulo= unLibro._titulo == otroLibro._titulo;
            boolean igualAutor= unLibro._autor == otroLibro._autor;
            return  igualTitulo == igualAutor;
        }
    //</editor-fold>
    
}
