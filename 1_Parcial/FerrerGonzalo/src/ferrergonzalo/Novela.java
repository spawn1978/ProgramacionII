/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrergonzalo;

/**
 *
 * @author gferrer_mecon
 */
public class Novela extends Libro
{
    public EGenero genero;
    
    //<editor-fold desc="CONSTRUCTOR">   
        public Novela(EGenero genero)
        {
            super();
            this.genero = genero;
        }
    //</editor-fold>
    //<editor-fold desc="METODOS">
        public String mostrar( )
        {
            StringBuilder cadena = new StringBuilder();            
                cadena.append(" Genero: ").append(this.genero);
                cadena.append("\n--------------------------\n");
                cadena.append(Libro.mostrar(this));
            return cadena.toString();
        }
        public static boolean compararNovelas( Novela unaNovela, Novela otraNovela) 
        {
            boolean igualLibro= Libro.compararLibros(unaNovela, otraNovela);
            boolean igualGenero = unaNovela.genero == otraNovela.genero;
            return igualLibro == igualGenero;
        }
    //</editor-fold>
}
