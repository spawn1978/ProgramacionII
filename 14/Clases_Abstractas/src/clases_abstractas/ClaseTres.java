/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;


final public class ClaseTres extends ClaseDos
{
    protected float atributoTres;
    
    public ClaseTres(ClaseDos dos, float atributo)
    {
        super(dos.atributoUno, dos.atrubutoDos);
        this.atributoTres=atributo;
    }
    public String mostrarTres()
    {
        StringBuilder cadena = new StringBuilder();
            cadena.append(super.mostrarDos());
            cadena.append("claseTres");
        return cadena.toString();
    }
    public float getTres()
    {
        return atributoTres;
    }
    
}
