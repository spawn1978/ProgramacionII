/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;

/**
 *
 * @author gferrer_mecon
 */
abstract public class ClaseUno        
{
    protected String atributoUno;

    public ClaseUno(String atributoUno)
    {
        this.atributoUno = atributoUno;
    }
    
    abstract public String mostrar();
    
    public String mostrarUno()
    {
        StringBuilder cadena = new StringBuilder();
            cadena.append("claseUno \n");
        return cadena.toString();
        
    }
    
    @Override public String toString()
    {
        return "clase1";
    }
    
    public String getUno()
    {
        return this.atributoUno;
    }
}
