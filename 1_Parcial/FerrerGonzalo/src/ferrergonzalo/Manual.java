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
public class Manual  extends Libro
{
    public ETipo tipo;

    //<editor-fold desc="CONSTRUCTOR">

        
        public Manual(ETipo _tipo, Autor _autor, float _precio, String _titulo)
        {
            
            super(_autor, _precio, _titulo);
            this.tipo = _tipo;
        }
    //</editor-fold>
    
    //<editor-fold desc="METODOS">
        public  String mostrar( )
        {
            StringBuilder cadena = new StringBuilder();            
                cadena.append(" Tipo Manual: ").append(this.tipo);
                cadena.append("\n--------------------------\n");
                cadena.append(Libro.mostrar(this));
            return cadena.toString();
        }
        
        public static boolean compararManuales( Manual unManual, Manual otroManual) 
        {
            boolean igualLibro= Libro.compararLibros(unManual, otroManual);
            boolean igualTipo = unManual.tipo == otroManual.tipo;
            return igualLibro == igualTipo;
        }
                
    //</editor-fold>
}
