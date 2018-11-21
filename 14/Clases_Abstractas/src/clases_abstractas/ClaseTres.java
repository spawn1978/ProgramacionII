/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;


final public class ClaseTres extends ClaseDos
{
    protected float atributoTres;
    
    public ClaseTres(String atributo1,int atributo2, float atributo)
    {
        super(atributo1, atributo2);
        this.atributoTres=atributo;
    }
    
    public ClaseTres(ClaseDos dos, float atributo)
    {
        super(dos.atributoUno, dos.atrubutoDos);
        this.atributoTres=atributo;
    }
    
    @Override public String toString()
    {   
        return super.toString()+" clase3";    
    }
    
    @Override public String mostrar()
    {
        StringBuilder cadena = new StringBuilder();
            cadena.append(super.mostrar());
            cadena.append("claseTres");
        return cadena.toString();
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
