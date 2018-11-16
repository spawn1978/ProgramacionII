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
public class Autor
{
    private String _Apellido;
    private String _Nombre;
    
    //<editor-fold desc="METODOS">
    public static boolean compararAutores( Autor unAutor, Autor otroAutor)
    {
        boolean igualNombre = unAutor._Nombre == otroAutor._Nombre;
        boolean igualApellido = unAutor._Apellido == otroAutor._Apellido;
        return igualNombre ==  igualApellido;
    }
    
    public static String mostrarAutor( Autor unAutor)
    {
        StringBuilder cadena = new StringBuilder();
            cadena.append(" Nombre: ").append(unAutor._Nombre);
            cadena.append(" Apellido: ").append(unAutor._Apellido);            
        return cadena.toString();
    }
    //</editor-fold>
}
