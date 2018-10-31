/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtroPackages;

import teoria_herencia.ClassHija;

/**
 *
 * @author gferrer_mecon
 */
public class ClassMundoParaleloHeredado extends ClassHija
{
    
    public ClassMundoParaleloHeredado(int x, int y, int z)
    {
        super(x, y, z);
    }
    
    public void mostrarTodo()
    {
        this.mostrarPadre();
    }
    
    
}
