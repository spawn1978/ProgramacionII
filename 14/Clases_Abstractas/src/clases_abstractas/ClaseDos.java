/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;


public class ClaseDos extends ClaseUno
{
    protected int atrubutoDos;
    
    public ClaseDos(String atributoUno,int atrubutoDos)
    {
        super(atributoUno);
        this.atrubutoDos=atrubutoDos;
    }
   
    @Override public String toString()
    {
        return super.toString()+" clase2";
    }
   
    @Override public String mostrar()
    {
         StringBuilder cadena = new StringBuilder();
            //cadena.append(super.mostrarUno());
            cadena.append("claseDos\n");
        return cadena.toString();
    }
    
    public String mostrarDos()
    {
        StringBuilder cadena = new StringBuilder();            
            cadena.append(super.mostrarUno());
            cadena.append("claseDos\n");
        return cadena.toString();
    }
    public int getDos()
    {
        return this.atrubutoDos;
    }
}
