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
            this._precio = precio;            
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
            int Nro = semilla.nextInt( MAX + 1 - MIN) ;
            return Nro;
        }
        public static boolean compararLibros ( Libro unLibro, Libro otroLibro)
        {
            boolean igualTitulo= unLibro._titulo == otroLibro._titulo;
            boolean igualAutor= unLibro._autor == otroLibro._autor;
            return  igualTitulo == igualAutor;
        }        
            
        public static String mostrar( Libro unLibro)
        {
            StringBuilder cadena = new StringBuilder();
            
                //cadena.append("\n--------------------------\n");
                cadena.append("\n Titulo: ").append(unLibro._titulo);                
                cadena.append("\n Autor: ").append(  Autor.mostrarAutor(unLibro._autor) );               
                cadena.append("\n Paginas: ").append(unLibro._cantPaginas);
                cadena.append("\n Precio: ").append(unLibro._precio);                
            return cadena.toString();
        }        
        
        public static ELibro getTipoLibro(Libro unLibro)
        {
            ELibro tipo = null;
            
            if(unLibro instanceof Manual)
            {
                tipo=ELibro.MANUAL;  
            }
            if(unLibro instanceof Novela)
            {
                tipo=ELibro.NOVELA;  
            }
            return tipo;
        }
                
        public static boolean getTipoLibro2(Libro unLibro, ELibro tipoClase)
        {                       
            return unLibro.getClass().getSimpleName().equalsIgnoreCase(tipoClase.toString());            
        }
        
        public static boolean getTipoLibro2(Libro unLibro, String NombreClase)
        {                       
            return unLibro.getClass().getSimpleName().equalsIgnoreCase(NombreClase);            
        }
    //</editor-fold>
    
}
