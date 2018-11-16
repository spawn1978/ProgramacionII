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
        public Libro(Autor _autor, int _cantPaginas, float _precio, String _titulo)
        {
            this._autor = _autor;
            this._cantPaginas = _cantPaginas;
            this._precio = _precio;
            this._titulo = _titulo;
        }
    //</editor-fold>
    
    //<editor-fold desc="METODOS">
        public int getCantidadPaginas()
        {            
            return this._cantPaginas;
        }
        
        private static int generadorDePaginas()
        {
            int MIN=10; int MAX=580;
            Random semilla=new Random();        
            int Nro = MIN + semilla.nextInt() * (MAX - MIN);
            return Nro;
        }
        
    //</editor-fold>
    
}
