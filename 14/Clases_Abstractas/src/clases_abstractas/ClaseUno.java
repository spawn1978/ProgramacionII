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
public class ClaseUno        
{
    protected String atributoUno;

    public ClaseUno(String atributoUno)
    {
        this.atributoUno = atributoUno;
    }
    
    public String mostrarUno()
    {
        StringBuilder cadena = new StringBuilder();
            cadena.append("claseUno");
        return cadena.toString();
    }
    public String getUno()
    {
        return this.atributoUno;
    }
}
